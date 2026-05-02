package s10_recuperare.clase;

public class Sectie implements Structura {
    private String numeSectie;
    private int nrAngajati;

    public Sectie(String numeSectie, int nrAngajati) {
        this.numeSectie = numeSectie;
        this.nrAngajati = nrAngajati;
    }

    @Override
    public void afiseazaDetaliiStructura() {
        System.out.println("Nume sectie "+this.numeSectie+", nr angajati: "+this.nrAngajati);
    }
}
