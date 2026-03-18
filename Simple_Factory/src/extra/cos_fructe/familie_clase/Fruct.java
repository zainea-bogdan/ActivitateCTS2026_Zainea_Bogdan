package extra.cos_fructe.familie_clase;

public abstract class Fruct {
    public boolean esteBun;
    public boolean areSeminte;

    public Fruct( boolean esteBun, boolean areSeminte) {
        this.esteBun = esteBun;
        this.areSeminte = areSeminte;
    }

    public abstract void afiseazaCaracteristici();
}
