package s4.stb.familie_clase;

public class Autobuz extends MijlocTransport{
    public Autobuz(int numarRoti, String nrInmatriculare) {
        super(numarRoti, nrInmatriculare);
    }

    @Override
    public void afiseazaDescriere() {
        StringBuilder bob = new StringBuilder();
        bob.append("\nAutobuzul are Numar roti: ").append(super.numarRoti);
        bob.append("\nNumar Inmatriculare: ").append(super.nrInmatriculare);

        System.out.println(bob);
    }
}
