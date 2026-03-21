package s6.clase.fabrici.fabrici_concrete;

import s6.clase.fabrici.Enums.TipDesert;
import s6.clase.fabrici.Enums.TipMancare;
import s6.clase.fabrici.FabricaAbstracta;
import s6.clase.famili_de_clase.FelMancare;
import s6.clase.famili_de_clase.familie_desert.Clatite;
import s6.clase.famili_de_clase.familie_desert.Papanasi;

public class FabricaDesert implements FabricaAbstracta {
    @Override
    public FelMancare getFelMancare(TipMancare tipMancare, float pret, float gramaj) {
        return getFelMancare(tipMancare, pret, gramaj, 500);
    }

    @Override
    public FelMancare getFelMancare(TipMancare tipMancare, float pret, float gramaj, int calorii) {
        if(tipMancare == TipDesert.CLATITE) {
            return new Clatite(pret, gramaj, calorii);
        } else if(tipMancare == TipDesert.PAPANASI) {
            return new Papanasi(pret, gramaj, calorii);
        }
        return null;
    }
}
