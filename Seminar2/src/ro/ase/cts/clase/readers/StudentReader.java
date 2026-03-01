package ro.ase.cts.clase.readers;

import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentReader extends AplicantReader{

    @Override
    public List<Aplicant> readAplicanti(String file) throws FileNotFoundException {
        Scanner input = new Scanner(new File(file));
        input.useDelimiter(",|\n");
        List<Aplicant> studenti = new ArrayList<Aplicant>();

        while (input.hasNext()) {
            Student s = new Student();
            super.readAplicant(input,s);
            int an_studii = input.nextInt();
            String facultate = (input.next()).toString();
            s.setAn_studii(an_studii);
            s.setFacultate(facultate);
            studenti.add(s);
        }
        input.close();
        return studenti;
    }
}
