package restaurant_comenzi_adapter1.clase.AdapterComenzi;

import restaurant_comenzi_adapter1.clase.Comenzi.GestionareComenziExterna;
import restaurant_comenzi_adapter1.clase.Comenzi.IGestionareComenzi;

/*adapter de obiecte */
public class AdapterComenzi implements IGestionareComenzi {
    private GestionareComenziExterna referintaExterna;

    public AdapterComenzi(GestionareComenziExterna referintaExterna) {
        this.referintaExterna = referintaExterna;
    }

    @Override
    public void prelucreazaComanda() {
            this.referintaExterna.manupulareComanda();
    }
}
