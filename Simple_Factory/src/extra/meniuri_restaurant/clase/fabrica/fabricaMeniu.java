package extra.meniuri_restaurant.clase.fabrica;

import extra.meniuri_restaurant.clase.familia_de_meniu.Meniu;
import extra.meniuri_restaurant.clase.familia_de_meniu.MeniuBauturi;
import extra.meniuri_restaurant.clase.familia_de_meniu.MeniuDesert;
import extra.meniuri_restaurant.clase.familia_de_meniu.MeniuMancare;

public class fabricaMeniu {
    public Meniu getMeniu(TipuriMeniu tip, int nrElem, int nrcategorii)
    {
        if(tip==TipuriMeniu.MENIU_MANCARE)
        {
            return new MeniuMancare(nrElem,nrcategorii);
        }
        else  if(tip==TipuriMeniu.MENIU_DESERT)
        {
            return new MeniuDesert(nrElem,nrcategorii);
        }
        else  if(tip==TipuriMeniu.MENIU_BAUTURI)
        {
            return new MeniuBauturi(nrElem,nrcategorii);
        }
        return null;
    }
}
