package extra.meniuri_restaurant.clase.familia_de_meniu;

public class MeniuBauturi extends Meniu{
    private int nrCategoriiDeBauturi;

    public MeniuBauturi(int nrElementeListate, int nrCategoriiDeBauturi) {
        super(nrElementeListate);
        this.nrCategoriiDeBauturi = nrCategoriiDeBauturi;
    }

    @Override
    public void afiseazaDetalii() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nNr Elemente de pe meniul de mancare: ").append(super.nrElementeListate);
        sb.append("\nNr Catgeorii de bauturi: ").append(this.nrCategoriiDeBauturi);
        System.out.println(sb);
    }
}
