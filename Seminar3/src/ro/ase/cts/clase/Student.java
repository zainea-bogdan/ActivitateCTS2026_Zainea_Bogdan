package ro.ase.cts.clase;

import java.util.Arrays;

public class Student extends Aplicant {
	protected String facultate;
	protected int an_studii;
	protected static int VALOARE_FINANTARE_STUDENT = 20;


	public void setFacultate(String facultate) {
		this.facultate = facultate;
	}

	public void setAn_studii(int an_studii) {
		this.an_studii = an_studii;
	}


	public Student() {
		super();

	}

	@Override
	public void afiseazaFinantare() {
		System.out.println("Studentul " + getNume() + " " + getPrenume() + " primeste " + Student.VALOARE_FINANTARE_STUDENT + " Euro/zi in proiect.");
	}

	public static void setValoareFinantareStudent(int valoareFinantareStudent) {
		VALOARE_FINANTARE_STUDENT = valoareFinantareStudent;
	}

	public Student(String nume, String prenume, int varsta, int punctaj, int nr_proiecte, String[] denumireProiect, String facultate, int an_studii) {
		super(nume, prenume, varsta, punctaj, nr_proiecte, denumireProiect);
		this.facultate = facultate;
		this.an_studii = an_studii;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("Student{");
		sb.append(super.toString());
		sb.append("facultate='").append(facultate).append('\'');
		sb.append(", an_studii=").append(an_studii);
		sb.append('}');
		return sb.toString();
	}
}
