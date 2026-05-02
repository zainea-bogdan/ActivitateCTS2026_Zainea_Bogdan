package s10_normal.clase;

import s10_normal.clase.TipuriAutobuz.TipCursa;

public interface MijlocDeTransport {
    void opresteInStatie(Statie statie);
    public int getNrPasageri();
    public TipCursa getTipCursa();
}
