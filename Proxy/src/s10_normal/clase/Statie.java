package s10_normal.clase;

public class Statie {
    private String numeStatie;
    private int nrCalatori;

    public Statie(String numeStatie, int nrCalatori) {
        this.numeStatie = numeStatie;
        this.nrCalatori = nrCalatori;
    }

    public String getNumeStatie() {
        return numeStatie;
    }

    public int getNrCalatori() {
        return nrCalatori;
    }
}
