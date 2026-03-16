package extra.Restaurant.clase;

public class Restaurant {
    public String numeRestaurant;
    public int numarMese;
    public int numarMeseOcupate;
    public static Restaurant instantaRestaurant = null;

    private Restaurant(String numeRestaurant, int numarMese, int numarMeseOcupate) {
        this.numeRestaurant = numeRestaurant;
        this.numarMese = numarMese;
        this.numarMeseOcupate = numarMeseOcupate;
    }

    public void rezervaMasa()
    {
        if(this.numarMese>this.numarMeseOcupate)
        {
            this.numarMeseOcupate++;
            System.out.println("Rezervarea a fost facuta cu succes");
        }
        else
        {
            System.out.println("Mesele sunt full");
        }
    }

    public void afiseazaDetaliiRestaurant()
    {
        StringBuilder builder =new StringBuilder();
        builder.append("Nume Restaurant:").append(this.numeRestaurant);
        builder.append("\nMese totale: ").append(this.numarMese);
        builder.append("\nMese ocupate: ").append(this.numarMeseOcupate);
        builder.append("\nMese ramase libere:").append(this.numarMese-this.numarMeseOcupate);

        System.out.println(builder);
    }

    public static synchronized Restaurant getInstance(String numeRestaurant, int numarMese, int numarMeseOcupate)
    {
        if(instantaRestaurant==null)
        {
            instantaRestaurant=new Restaurant(numeRestaurant,numarMese,numarMeseOcupate);
        }
        return instantaRestaurant;
    }


}
