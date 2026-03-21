package extra.meniuri_restaurant.clase.familia_de_meniu;

public abstract class Meniu {
    protected int nrElementeListate;

    public Meniu(int nrElementeListate) {
        this.nrElementeListate = nrElementeListate;
    }


    public abstract void afiseazaDetalii();
}
