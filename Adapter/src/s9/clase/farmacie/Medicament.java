package s9.clase.farmacie;

public class Medicament {
    private String nume;

    public Medicament(String nume) {
        this.nume = nume;
    }

    public void cumparaMedicament()
    {
        System.out.println("Medicament "+nume+"a fost cumparat.");
    }
}
