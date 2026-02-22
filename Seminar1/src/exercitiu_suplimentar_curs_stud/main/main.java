package exercitiu_suplimentar_curs_stud.main;

import exercitiu_suplimentar_curs_stud.cursuri.Curs;
import exercitiu_suplimentar_curs_stud.persoane.Asistent;
import exercitiu_suplimentar_curs_stud.persoane.Profesor;
import exercitiu_suplimentar_curs_stud.persoane.Student;

public class main {
    public static void main(String[] args) {
        Curs curs = new Curs("cts",5,new Profesor("Gica Profu",30,"prf1"));
        System.out.println("Nume curs: "+curs.getNumeCurs());
        System.out.println("Nr credite: "+curs.getNrCredite());
        System.out.println("Nume prof: "+curs.getProfu().getNume());
        System.out.println("Varsta prof: "+curs.getProfu().getVarsta());
        System.out.println("Id prof: "+curs.getProfu().getIdAngajat());
        curs.getProfu().preda();
        System.out.println("=============================================");
        curs.addStudent(new Student("Gica Studentul",20,"std1"));
        curs.afiseazaStuds();
        System.out.println("=============================================");
        Asistent asistent = new Asistent("Gica Asistentul",10,"asistent1");
        System.out.println("Id asistent: "+asistent.getIdAsistent());
        System.out.println("nume asistent: "+asistent.getNume());
        System.out.println("varsta asistent: "+asistent.getVarsta());

    }
}
