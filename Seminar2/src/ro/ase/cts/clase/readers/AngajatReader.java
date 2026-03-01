package ro.ase.cts.clase.readers;

import ro.ase.cts.clase.Angajat;
import ro.ase.cts.clase.Aplicant;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AngajatReader extends AplicantReader{
    @Override
    public List<Aplicant> readAplicanti(String file) throws FileNotFoundException {
        Scanner input2 = new Scanner(new File(file));
        input2.useDelimiter(",");
        List<Aplicant> angajati = new ArrayList<Aplicant>();

        while (input2.hasNext()) {
            Angajat a = new Angajat();
            super.readAplicant(input2,a);
            int salariu = input2.nextInt();
            String ocupatie = input2.next();
            a.setOcupatie(ocupatie);
            a.setSalariu(salariu);
            angajati.add(a);
        }
        input2.close();
        return angajati;
    }
}
