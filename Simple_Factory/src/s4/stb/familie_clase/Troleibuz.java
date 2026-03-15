package s4.stb.familie_clase;

public class Troleibuz extends MijlocTransport {
    public Troleibuz(int numarRoti, String nrInmatriculare) {
        super(numarRoti, nrInmatriculare);
    }

    @Override
    public void afiseazaDescriere() {
        StringBuilder bob = new StringBuilder();
        bob.append("\nTroleu are Numar roti: ").append(super.numarRoti);
        bob.append("\nNumar Inmatriculare: ").append(super.nrInmatriculare);

        System.out.println(bob);
    }
}
