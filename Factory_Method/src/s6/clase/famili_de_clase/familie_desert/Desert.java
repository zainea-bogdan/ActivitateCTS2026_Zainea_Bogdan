package s6.clase.famili_de_clase.familie_desert;

import s6.clase.famili_de_clase.FelMancare;

public abstract class Desert implements FelMancare {
    protected float pret;
    protected float gramaj;
    protected int calorii;

    public Desert(float pret, float gramaj, int calorii) {
        this.pret = pret;
        this.gramaj = gramaj;
        this.calorii = calorii;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Desert{");
        sb.append("pret=").append(pret);
        sb.append(", gramaj=").append(gramaj);
        sb.append(", calorii=").append(calorii);
        sb.append('}');
        return sb.toString();
    }
}
