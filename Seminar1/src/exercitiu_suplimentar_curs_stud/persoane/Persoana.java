package exercitiu_suplimentar_curs_stud.persoane;

public  class Persoana implements IPersoane {
    protected String nume;
    protected  int varsta;

    public Persoana(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    public String getNume() {
        return nume;
    }

    public int getVarsta() {
        return varsta;
    }

}
