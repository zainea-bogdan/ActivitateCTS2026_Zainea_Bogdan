package extra.meniuri_restaurant.clase.familia_de_meniu;

public class MeniuMancare extends Meniu{
    private int nrFeluriDeMancare;

    public MeniuMancare(int nrElementeListate, int nrFeluriDeMancare) {
        super(nrElementeListate);
        this.nrFeluriDeMancare = nrFeluriDeMancare;
    }

    @Override
    public void afiseazaDetalii() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nNr Elemente de pe meniul de mancare: ").append(super.nrElementeListate);
        sb.append("\nNr Feluri de Mancare: ").append(this.nrFeluriDeMancare);
        System.out.println(sb);
    }
}
