package extra.cos_fructe.familie_clase;

public class Nuca extends Fruct{
    public Nuca(boolean esteBun, boolean areSeminte) {
        super( esteBun, areSeminte);
    }

    @Override
    public void afiseazaCaracteristici() {
        StringBuilder bob = new StringBuilder();
        bob.append("\n\nAre seminte? ").append(super.areSeminte);
        bob.append("\nEste bun inca? ").append(super.esteBun);
        System.out.println(bob);
    }
}
