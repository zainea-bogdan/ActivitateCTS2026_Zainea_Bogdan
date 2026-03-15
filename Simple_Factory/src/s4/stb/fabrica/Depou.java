package s4.stb.fabrica;

import s4.stb.familie_clase.Autobuz;
import s4.stb.familie_clase.MijlocTransport;
import s4.stb.familie_clase.Tramvai;
import s4.stb.familie_clase.Troleibuz;

import static s4.stb.fabrica.Tipuri.*;

public class Depou {
    public MijlocTransport getMijlocTransport(Tipuri tip, int numarRoti, String numarInmatriculare)
    {
        if(tip == AUTOBUZ)
        {
            return new Autobuz(numarRoti,numarInmatriculare);
        }
        if(tip == TRAMVAI)
        {
            return new Tramvai(numarRoti,numarInmatriculare);
        }
        if(tip == TROLEIBUZ)
        {
            return new Troleibuz(numarRoti,numarInmatriculare);
        }

        return null;
    }
}
