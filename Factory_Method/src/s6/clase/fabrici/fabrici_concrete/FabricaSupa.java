package s6.clase.fabrici.fabrici_concrete;

import s6.clase.fabrici.Enums.TipMancare;
import s6.clase.fabrici.Enums.TipSupa;
import s6.clase.fabrici.FabricaAbstracta;
import s6.clase.famili_de_clase.FelMancare;
import s6.clase.famili_de_clase.familie_supa.SupaCiuperci;
import s6.clase.famili_de_clase.familie_supa.SupaLegume;

public class FabricaSupa implements FabricaAbstracta {
    @Override
    public FelMancare getFelMancare(TipMancare tipMancare, float pret, float gramaj) {
        if(tipMancare == TipSupa.LEGUME) {
            return new SupaLegume(pret, gramaj);
        } else if(tipMancare == TipSupa.CIUPERCI) {
            return new SupaCiuperci(pret, gramaj);
        }
        return null;
    }

    @Override
    public FelMancare getFelMancare(TipMancare tipMancare, float pret, float gramaj, int calorii) {
        return this.getFelMancare(tipMancare, pret, gramaj);
    }
}