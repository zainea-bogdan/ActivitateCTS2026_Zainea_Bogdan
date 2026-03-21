package s6.main;

import s6.clase.fabrici.Enums.TipDesert;
import s6.clase.fabrici.Enums.TipSupa;
import s6.clase.fabrici.fabrici_concrete.FabricaDesert;
import s6.clase.fabrici.fabrici_concrete.FabricaSupa;
import s6.clase.famili_de_clase.FelMancare;

public class main {
    public static void main(String[] args) {
        FabricaDesert fabricaDesert = new FabricaDesert();
        FabricaSupa fabricaSupa = new FabricaSupa();

        FelMancare supaCiuperci = fabricaSupa.getFelMancare(TipSupa.CIUPERCI, 15.5f, 300.0f);
        FelMancare supaLegume = fabricaSupa.getFelMancare(TipSupa.LEGUME, 20.0f, 350.0f);

        FelMancare clatite = fabricaDesert.getFelMancare(TipDesert.CLATITE, 20.0f, 350.0f, 500);
        FelMancare papanasi = fabricaDesert.getFelMancare(TipDesert.PAPANASI, 35.0f, 200.0f, 300);

        supaCiuperci.afisare();
        supaLegume.afisare();

        clatite.afisare();
        papanasi.afisare();
    }
}
