package ro.ase.cts.main;

import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.readers.AngajatReader;
import ro.ase.cts.clase.readers.AplicantReader;

import java.io.FileNotFoundException;
import java.util.List;



public class Program {

	public static void main(String[] args) {
		List<Aplicant> listaAngajati;
		try {
			AplicantReader angajatiReader = new AngajatReader();
			listaAngajati = angajatiReader.readAplicanti("angajati.txt");
			for(Aplicant angajat:listaAngajati)
				System.out.println(angajat.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
