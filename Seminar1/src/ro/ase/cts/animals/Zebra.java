package ro.ase.cts.animals;

public class Zebra extends Animal{
    private int nr_linii;

    public Zebra(String name, int age, int nr_linii) {
        super(name, age);
        this.nr_linii = nr_linii;
    }

    @Override
    public void eat(String feeder) {
        System.out.println("Zebra "+super.name+" cu varsta de "+super.age+" ani are un nr de linii pe corp de "+this.nr_linii+ " a fost hranit de "+feeder);
    }
}
