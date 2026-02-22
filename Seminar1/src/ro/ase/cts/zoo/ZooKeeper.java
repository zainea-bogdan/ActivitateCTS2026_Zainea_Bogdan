package ro.ase.cts.zoo;

import ro.ase.cts.animals.Animal;

public class ZooKeeper {
    private String nume_keeper;

    public ZooKeeper(String nume_keeper) {
        this.nume_keeper = nume_keeper;
    }

    public void feedAnimal(Animal animalut)
    {
        animalut.eat(this.nume_keeper);
    }
}
