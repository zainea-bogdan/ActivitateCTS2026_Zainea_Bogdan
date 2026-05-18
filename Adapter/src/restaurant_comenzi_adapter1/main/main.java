package restaurant_comenzi_adapter1.main;

/*
Restaurantul achiziționează un nou soft pentru gestionarea comenzilor online (ex. Glovo), însă acesta nu este compatibil cu softul intern de gestiune a comenzilor din bucătărie.
Cele două soft-uri au fost dezvoltate de echipe diferite și au clase incompatibile.
 Să se implementeze un nivel intermediar prin care comenzile din softul extern să poată fi procesate de softul intern,
 fără a se modifica codul din niciuna dintre aplicații.
* */


import restaurant_comenzi_adapter1.clase.AdapterComenzi.AdapterClaseComenzi;
import restaurant_comenzi_adapter1.clase.AdapterComenzi.AdapterComenzi;
import restaurant_comenzi_adapter1.clase.Comenzi.GestionareComenzInterna;
import restaurant_comenzi_adapter1.clase.Comenzi.GestionareComenziExterna;
import restaurant_comenzi_adapter1.clase.Comenzi.IGestionareComenzi;

public class main {
    // clientul cunoaște doar IGestionareComenzi
    public static void proceseazaComanda(IGestionareComenzi gestionare) {
        gestionare.prelucreazaComanda();
    }

    public static void main(String[] args) {
        // sistemul intern — folosit direct
        GestionareComenzInterna interna = new GestionareComenzInterna(1);

        // sistemul extern — adaptat prin Adapter de Obiecte
        GestionareComenziExterna externa = new GestionareComenziExterna("GLV-99");
        AdapterComenzi adapter = new AdapterComenzi(externa);

        // sistemul extern — adaptat prin Adapter de Clase
        AdapterClaseComenzi adapterClase = new AdapterClaseComenzi("GLV-100");

        proceseazaComanda(interna);       // ✅ direct
        proceseazaComanda(adapter);       // ✅ prin adapter de obiecte
        proceseazaComanda(adapterClase);  // ✅ prin adapter de clase
    }
}
