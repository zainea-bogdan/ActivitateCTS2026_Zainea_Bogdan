package s10_normal.clase.TipuriAutobuz;

import s10_normal.clase.MijlocDeTransport;
import s10_normal.clase.Statie;

public class AutobuzDeNoapte implements MijlocDeTransport {
    private MijlocDeTransport mijlocDeTransport;

    public AutobuzDeNoapte(MijlocDeTransport mijlocDeTransport) {
        this.mijlocDeTransport = mijlocDeTransport;
    }

    @Override
    public void opresteInStatie(Statie statie) {
        if(statie.getNrCalatori()>0 || this.mijlocDeTransport.getNrPasageri()>0){
            this.mijlocDeTransport.opresteInStatie(statie);
        }else{
            System.out.println("Mijlocul de transport nu opreste in statia "+statie.getNumeStatie());
        }
    }

    @Override
    public int getNrPasageri() {
        return this.mijlocDeTransport.getNrPasageri();
    }

    @Override
    public TipCursa getTipCursa() {
        return this.mijlocDeTransport.getTipCursa();
    }
}
