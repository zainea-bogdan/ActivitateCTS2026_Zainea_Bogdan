package extra.ClassroomKeeper.clase;

// este o instanta unica care aloca sali de curs/seminar ( doar cu strings sa arate ca rezerva )
public class ClassroomKeeper {
    private String numeResponsabil;
    private int numarSaliDisponibile;
    private int numarSaliOcupate;
    private static ClassroomKeeper instanta = null;

    private ClassroomKeeper(String numeResponsabil, int numarSaliDisponibile, int numarSaliOcupate) {
        this.numeResponsabil = numeResponsabil;
        this.numarSaliDisponibile = numarSaliDisponibile;
        this.numarSaliOcupate = numarSaliOcupate;
    }

    public void rezervaSala()
    {
        if(this.numarSaliDisponibile>this.numarSaliOcupate)
        {
            System.out.println("O sala a fost rezervata");
        }
        else
        {
            System.out.println("Toate salile sunt ocupate");
        }
        this.numarSaliOcupate++;
    }

    public static synchronized ClassroomKeeper getInstance(String numeResponsabil, int numarSaliDisponibile, int numarSaliOcupate)
    {
        if(instanta==null)
        {
            instanta = new ClassroomKeeper(numeResponsabil,numarSaliDisponibile,numarSaliOcupate);
        }
        return instanta;
    }
}
