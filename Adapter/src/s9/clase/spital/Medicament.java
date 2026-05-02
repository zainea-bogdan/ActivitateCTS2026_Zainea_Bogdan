package s9.clase.spital;

public class Medicament {
    private String nume;
    private float pret;

    public Medicament(String nume, float pret) {
        this.nume = nume;
        this.pret = pret;
    }

    public void achizitioneazaMedicament()
    {
        if (prezintaReteta())
        {
            System.out.println("Medicament Nurofen a fost achizitionat");
        }
        else {
            System.out.println("nu a prezentat reteta");
        }

    }

    public boolean prezintaReteta()
    {
        return this.nume.length()>10;
    }

    public String getNume() {
        return nume;
    }
}
