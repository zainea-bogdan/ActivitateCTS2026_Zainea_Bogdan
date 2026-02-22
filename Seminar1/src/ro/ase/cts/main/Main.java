package ro.ase.cts.main;

import ro.ase.cts.animals.Animal;
import ro.ase.cts.animals.Lion;
import ro.ase.cts.animals.Zebra;
import ro.ase.cts.zoo.Zoo;
import ro.ase.cts.zoo.ZooKeeper;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Zoo gradina_zoo = new Zoo("gradina_baneasa",
                new ZooKeeper("Gica"));
        gradina_zoo.addAnimal(new Lion("pichy",2,10));
        gradina_zoo.addAnimal(new Zebra("zeha",2,10));

        gradina_zoo.feedAllAnimals();
    }
}