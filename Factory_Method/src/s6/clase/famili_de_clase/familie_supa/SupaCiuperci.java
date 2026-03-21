package s6.clase.famili_de_clase.familie_supa;

public class SupaCiuperci extends Supa{
    public SupaCiuperci(float gramaj, float pret) {
        super(gramaj, pret);
    }

    @Override
    public void afisare() {
        StringBuilder sb = new StringBuilder();
        sb.append("Supa de ciuperci are ").append(super.toString());
        System.out.println(sb);
    }
}
