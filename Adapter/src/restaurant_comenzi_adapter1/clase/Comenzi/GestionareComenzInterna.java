package restaurant_comenzi_adapter1.clase.Comenzi;

public class GestionareComenzInterna implements IGestionareComenzi{
    private int idComanda;

    public GestionareComenzInterna(int idComanda) {
        this.idComanda = idComanda;
    }

    @Override
    public void prelucreazaComanda() {
        System.out.printf("\nA fost prelucrata Comanda cu id-ul: "+this.idComanda);
    }
}
