package ro.ase.cts.zoo;

import ro.ase.cts.animals.Animal;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private String nume_zoo;
    private ZooKeeper keeper;
    private List<Animal> lista_animale;

    public Zoo(String nume_zoo, ZooKeeper keeper) {
        this.nume_zoo = nume_zoo;
        this.keeper = keeper;
        this.lista_animale=new ArrayList<Animal>();
    }

    public void addAnimal(Animal animalut)
    {
        this.lista_animale.add(animalut);
    }

    public void feedAllAnimals()
    {
        for(Animal animalut:this.lista_animale)
        {
            keeper.feedAnimal(animalut);
        }
    }
}
