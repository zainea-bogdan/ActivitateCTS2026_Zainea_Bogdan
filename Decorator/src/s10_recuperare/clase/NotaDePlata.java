package s10_recuperare.clase;

public class NotaDePlata implements NotaDePlataAbstracta{
    private float pret;
    private String nrMasa;

    public NotaDePlata(float pret, String nrMasa) {
        super();
        this.pret = pret;
        this.nrMasa = nrMasa;
    }

    @Override
    public void printeazaNotaDePlata() {
        System.out.println("Nota de plata este de "+pret+" si este emisa pt masa "+nrMasa);
    }

    public float getPret() {
        return pret;
    }

    public NotaDePlata setPret(float pret) {
        this.pret = pret;
        return this;
    }

    public String geNrMasa() {
        return nrMasa;
    }

    public NotaDePlata setNrMasa(String nrMasa) {
        this.nrMasa = nrMasa;
        return this;
    }
}
