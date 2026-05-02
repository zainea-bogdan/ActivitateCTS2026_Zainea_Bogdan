package s10_normal.clase.TipuriAutobuz;

import s10_normal.clase.MijlocDeTransport;
import s10_normal.clase.Statie;

public class AutobuzCursaSpeciala implements MijlocDeTransport {
    private MijlocDeTransport mijlocDeTransport;

    public AutobuzCursaSpeciala(MijlocDeTransport mijlocDeTransport) {
        this.mijlocDeTransport = mijlocDeTransport;
    }

    @Override
    public void opresteInStatie(Statie statie) {
        if(this.mijlocDeTransport.getTipCursa()==TipCursa.SPECIALA){
            System.out.println("Nu opreste in statiile STB");
        }else{
            this.mijlocDeTransport.opresteInStatie(statie);
        }
    }

    @Override
    public int getNrPasageri() {
        return 0;
    }

    @Override
    public TipCursa getTipCursa() {
        return null;
    }
}
