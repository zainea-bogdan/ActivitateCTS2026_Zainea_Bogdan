package ro.ase.cts.clase;

import java.util.Arrays;

public class Angajat extends Aplicant{
	private String ocupatie;
	private int salariu;
	private static int VALOARE_FINANTARE_ANGAJAT = 10;


	public void setOcupatie(String ocupatie) {
		this.ocupatie = ocupatie;
	}

	public void setSalariu(int salariu) {
		this.salariu = salariu;
	}

	public Angajat() {
		super();

	}

	public static void setValoareFinantareAngajat(int valoareFinantareAngajat) {
		VALOARE_FINANTARE_ANGAJAT = valoareFinantareAngajat;
	}

	@Override
	public void afiseazaFinantare() {
		System.out.println("Angajatul " + getNume() + " " + getPrenume() + " primeste " + Angajat.VALOARE_FINANTARE_ANGAJAT + " Euro/zi in proiect.");
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("Angajat{");
		sb.append(super.toString());
		sb.append("ocupatie='").append(ocupatie).append('\'');
		sb.append(", salariu=").append(salariu);
		sb.append('}');
		return sb.toString();
	}
	
}
