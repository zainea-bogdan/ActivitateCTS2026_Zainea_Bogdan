package ro.ase.cts.main;

import ro.ase.cts.clase.Angajat;
import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.readers.AngajatReader;
import ro.ase.cts.clase.readers.AplicantReader;

import java.io.FileNotFoundException;
import java.util.List;



public class Program {

	public static void main(String[] args) {
		Angajat.setValoareFinantareAngajat(50);
		List<Aplicant> listaAngajati;
		try {
			AplicantReader angajatiReader = new AngajatReader("angajati.txt");
			listaAngajati = angajatiReader.readAplicanti();
			for (Aplicant angajat : listaAngajati) {
				System.out.println(angajat.toString());
				angajat.afiseazaFinantare();
				angajat.afisareStatut();
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
