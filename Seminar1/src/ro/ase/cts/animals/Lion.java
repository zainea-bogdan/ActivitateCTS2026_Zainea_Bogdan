package ro.ase.cts.animals;

public class Lion extends Animal{
    private int weight;

    public Lion(String name, int age, int weight) {
        super(name, age);
        this.weight = weight;
    }

    @Override
    public void eat(String feeder) {
        System.out.println("Leul "+super.name+" cu varsta de "+super.age+" ani are greutate de "+this.weight + " a fost hranit de "+feeder);
    }
}
