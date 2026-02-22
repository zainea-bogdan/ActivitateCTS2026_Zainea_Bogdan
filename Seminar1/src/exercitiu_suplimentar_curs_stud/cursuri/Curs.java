package exercitiu_suplimentar_curs_stud.cursuri;

import exercitiu_suplimentar_curs_stud.persoane.Profesor;
import exercitiu_suplimentar_curs_stud.persoane.Student;

import java.util.ArrayList;
import java.util.List;

public class Curs {
    private String numeCurs;
    private int nrCredite;
    private Profesor profu;
    private List<Student> lista_studs;


    public Curs(String numeCurs, int nrCredite, Profesor profu) {
        this.numeCurs = numeCurs;
        this.nrCredite = nrCredite;
        this.profu = profu;
        this.lista_studs = new ArrayList<Student>();
    }

    public void addStudent(Student stud)
    {
        this.lista_studs.add(stud);
    }

    public int getNrCredite() {
        return nrCredite;
    }

    public String getNumeCurs() {
        return numeCurs;
    }

    public Profesor getProfu() {
        return profu;
    }

    public void afiseazaStuds()
    {
        for(Student stud:this.lista_studs)
        {
            System.out.println("Id stud: "+ stud.getIdStudent());
            System.out.println("Id stud: "+ stud.getNume());
            System.out.println("Id stud: "+ stud.getVarsta());
            System.out.println("==================================");
        }
    }
}
