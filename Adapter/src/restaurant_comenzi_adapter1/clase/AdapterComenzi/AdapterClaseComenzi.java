package restaurant_comenzi_adapter1.clase.AdapterComenzi;

import restaurant_comenzi_adapter1.clase.Comenzi.GestionareComenziExterna;
import restaurant_comenzi_adapter1.clase.Comenzi.IGestionareComenzi;

public class AdapterClaseComenzi extends GestionareComenziExterna implements IGestionareComenzi {
    public AdapterClaseComenzi(String idComandaExtern) {
        super(idComandaExtern);
    }

    @Override
    public void prelucreazaComanda() {
        manupulareComanda();
    }
}
