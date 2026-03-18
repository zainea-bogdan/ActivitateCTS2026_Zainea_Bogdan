package extra.cos_fructe.main;

import extra.cos_fructe.fabrica.TipuriDeFructe;
import extra.cos_fructe.fabrica.fabricaDeFructe;
import extra.cos_fructe.familie_clase.Fruct;

public class main {
    public static void main(String[] args) {
        fabricaDeFructe fabrica = new fabricaDeFructe();
        Fruct mar = fabrica.getFruct(TipuriDeFructe.MAR,true,true);
        Fruct para = fabrica.getFruct(TipuriDeFructe.PARA,false,true);
        Fruct nuca = fabrica.getFruct(TipuriDeFructe.NUCA,true,false);

        mar.afiseazaCaracteristici();
        para.afiseazaCaracteristici();
        nuca.afiseazaCaracteristici();
    }
}
