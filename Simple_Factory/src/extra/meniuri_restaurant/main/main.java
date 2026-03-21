package extra.meniuri_restaurant.main;

import extra.meniuri_restaurant.clase.fabrica.TipuriMeniu;
import extra.meniuri_restaurant.clase.fabrica.fabricaMeniu;
import extra.meniuri_restaurant.clase.familia_de_meniu.Meniu;

public class main {
    public static void main(String[] args) {
        fabricaMeniu  fabrica = new fabricaMeniu();

        Meniu men_mancare = fabrica.getMeniu(TipuriMeniu.MENIU_MANCARE,20,4);
        Meniu men_bauturi = fabrica.getMeniu(TipuriMeniu.MENIU_BAUTURI,42,6);
        Meniu men_desert = fabrica.getMeniu(TipuriMeniu.MENIU_DESERT,9,3);

        men_mancare.afiseazaDetalii();
        men_desert.afiseazaDetalii();
        men_bauturi.afiseazaDetalii();
    }
}
