package s6.clase.famili_de_clase.familie_supa;

import s6.clase.famili_de_clase.FelMancare;

public abstract class Supa implements FelMancare {
    protected float pret;
    protected float gramaj;

    public Supa(float gramaj, float pret) {
        this.gramaj = gramaj;
        this.pret = pret;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Supa{");
        sb.append("pret=").append(pret);
        sb.append(", gramaj=").append(gramaj);
        sb.append('}');
        return sb.toString();
    }
}
