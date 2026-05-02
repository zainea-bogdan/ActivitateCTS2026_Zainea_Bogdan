package s10_normal.clase.TipuriAutobuz;

import s10_normal.clase.MijlocDeTransport;
import s10_normal.clase.Statie;

public class Autobuz implements MijlocDeTransport {
    private int nrPasageri;
    private int nrLinie;
    private TipCursa tipCursa;

    public Autobuz(int nrPasageri, int nrLinie) {
        this.nrPasageri = nrPasageri;
        this.nrLinie = nrLinie;
        this.tipCursa=TipCursa.NORMALA;
    }

    public Autobuz(int nrPasageri, int nrLinie, TipCursa tipCursa) {
        this.nrPasageri = nrPasageri;
        this.nrLinie = nrLinie;
        this.tipCursa = tipCursa;
    }

    public int getNrLinie() {
        return nrLinie;
    }

    @Override
    public void opresteInStatie(Statie statie) {
        System.out.println("Autobuzul de pe linia "+nrLinie+", a oprit in statia"+statie.getNumeStatie());
    }

    @Override
    public int getNrPasageri() {
        return 0;
    }

    public TipCursa getTipCursa() {
        return tipCursa;
    }
}
