package ro.ase.cts.clase.readers;

import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentReader extends AplicantReader{
    public StudentReader(String numeFisier) {
        super(numeFisier);
    }

    @Override
    public List<Aplicant> readAplicanti() throws FileNotFoundException {
        Scanner input = new Scanner(new File(super.numeFisier));
        input.useDelimiter(",|\n");
        List<Aplicant> studenti = new ArrayList<Aplicant>();

        while (input.hasNext()) {
            Student s = new Student();

            super.readAplicant(input, s);

            int an_studii = input.nextInt();
            String facultate = (input.next()).toString();

            s.setFacultate(facultate);
            s.setAn_studii(an_studii);

            studenti.add(s);
        }
        input.close();
        return studenti;
    }
}
