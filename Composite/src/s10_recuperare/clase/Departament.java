package s10_recuperare.clase;

import java.util.ArrayList;
import java.util.List;

public class Departament implements Structura{
    private String numeDep;
    private List<Structura> subStructuri;

    public Departament(String numeDep) {
        this.numeDep = numeDep;
        this.subStructuri = new ArrayList<>();
    }

    @Override
    public void afiseazaDetaliiStructura() {
        System.out.println("Nume departament "+this.numeDep);
        for(Structura structura:subStructuri){
            structura.afiseazaDetaliiStructura();
        }
    }

    public void adaugaStructura(Structura structura){
        subStructuri.add(structura);
    }

    public void stergeStructura(Structura structura){
        subStructuri.remove(structura);
    }

    public Structura getStructura(int poz){
        return subStructuri.get(poz);
    }
}
