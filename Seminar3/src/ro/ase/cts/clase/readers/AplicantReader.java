package ro.ase.cts.clase.readers;


import ro.ase.cts.clase.Aplicant;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;


public abstract class AplicantReader {
    protected String numeFisier;

    public abstract List<Aplicant> readAplicanti() throws FileNotFoundException;

    protected void readAplicant(Scanner input, Aplicant outAplicant) {
        String nume = input.next();
        String prenume = (input.next()).toString();
        int varsta = Integer.valueOf(input.nextInt());
        int punctaj = Integer.valueOf(input.nextInt());
        int nr = Integer.valueOf(input.nextInt());
        String[] vect = new String[nr];
        for (int i = 0; i < nr; i++)
            vect[i] = input.next();

        outAplicant.setNume(nume);
        outAplicant.setPrenume(prenume);
        outAplicant.setVarsta(varsta);
        outAplicant.setPunctaj(punctaj);
        outAplicant.setNr_proiecte(nr, vect);
    }

    public AplicantReader(String numeFisier) {
        this.numeFisier = numeFisier;
    }
}
