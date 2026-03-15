package s4.hotel.clase;

public class Hotel {

    private String numeHotel;
    private int numarCamere;
    private int numarCamereOcupate;
    private static Hotel instance = null;
    //null = lazy singleton/thread safe: singleton | cu un obiect nou = eager singleton

    private Hotel(String numeHotel, int numarCamere, int numarCamereOcupate) {
        this.numeHotel = numeHotel;
        this.numarCamere = numarCamere;
        this.numarCamereOcupate = numarCamereOcupate;
    }

    public void rezervaCamera()
    {
        if(this.numarCamere>this.numarCamereOcupate)
        {
            System.out.println("Rezervarea a fost realizata");
            this.numarCamereOcupate++;
        }
        else {
            System.out.println("nu mai avem camere");
        }
    }

    public void afiseazaDetaliiHotel()
    {
        StringBuilder builder =new StringBuilder();
        builder.append("Nume Hotel:").append(this.numeHotel);
        builder.append("\nCamere totale: ").append(this.numarCamere);
        builder.append("\nCamere ocupate: ").append(this.numarCamereOcupate);
        builder.append("\nCamere ramase libere:").append(this.numarCamere-this.numarCamereOcupate);

        System.out.println(builder);
    }

    public void afiseazaGradOcupare()
    {
        StringBuilder builder =new StringBuilder();
        builder.append("\nGrad ocupare:").append((this.numarCamereOcupate/this.numarCamere)*100).append("%");
        System.out.println(builder);
    }

    public static synchronized Hotel getInstance(String numeHotel, int numarCamere, int numarCamereOcupate)
    {
        if(instance==null)
        {
            instance = new Hotel(numeHotel,numarCamere,numarCamereOcupate);
        }
        return instance;
    }
}
