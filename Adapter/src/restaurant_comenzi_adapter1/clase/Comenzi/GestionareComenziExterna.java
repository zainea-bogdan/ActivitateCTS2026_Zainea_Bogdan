package restaurant_comenzi_adapter1.clase.Comenzi;

public class GestionareComenziExterna {
    private String idComandaExtern;

    public GestionareComenziExterna(String idComandaExtern) {
        this.idComandaExtern = idComandaExtern;
    }

    public void manupulareComanda()
    {
        System.out.printf("\nA fost manipulata , pregatia si gata de livrare, comanda cu id-ul "+this.idComandaExtern);
    }
}
