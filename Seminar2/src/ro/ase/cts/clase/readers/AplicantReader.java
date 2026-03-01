package ro.ase.cts.clase.readers;


import ro.ase.cts.clase.Aplicant;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;


public abstract class AplicantReader {
    public abstract List<Aplicant> readAplicanti(String file) throws FileNotFoundException;

    public void readAplicant(Scanner input2, Aplicant a)
    {
        String nume = input2.next();
        String prenume = input2.next();
        int varsta = input2.nextInt();
        int punctaj = input2.nextInt();
        int nr = input2.nextInt();
        String[] vect = new String[5];
        for (int i = 0; i < nr; i++)
            vect[i] = input2.next();

        a.setNume(nume);
        a.setPrenume(prenume);
        a.setVarsta(varsta);
        a.setNr_proiecte(nr, vect);
        a.setPunctaj(punctaj);
    }
}
