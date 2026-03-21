package extra.meniuri_restaurant.clase.familia_de_meniu;

public class MeniuDesert extends Meniu{
    private int nrTipuriDeDesert;

    public MeniuDesert(int nrElementeListate, int nrTipuriDeDesert) {
        super(nrElementeListate);
        this.nrTipuriDeDesert = nrTipuriDeDesert;
    }

    @Override
    public void afiseazaDetalii() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nNr Elemente de pe meniul de mancare: ").append(super.nrElementeListate);
        sb.append("\nNr Tipuri de Desert: ").append(this.nrTipuriDeDesert);
        System.out.println(sb);
    }
}
