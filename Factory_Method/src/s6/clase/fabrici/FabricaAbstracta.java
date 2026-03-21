package s6.clase.fabrici;

import s6.clase.fabrici.Enums.TipMancare;
import s6.clase.famili_de_clase.FelMancare;

public interface FabricaAbstracta {
     FelMancare getFelMancare(TipMancare tipMancare, float pret, float gramaj);
     FelMancare getFelMancare(TipMancare tipMancare, float pret, float gramaj, int calorii);
}
