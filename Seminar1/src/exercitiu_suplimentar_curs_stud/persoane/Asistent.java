package exercitiu_suplimentar_curs_stud.persoane;

public class Asistent extends Persoana implements IPredabil{
    private String idAsistent;

    public Asistent(String nume, int varsta, String idAsistent) {
        super(nume, varsta);
        this.idAsistent = idAsistent;
    }

    public String getIdAsistent() {
        return idAsistent;
    }

    @Override
    public void preda() {
        System.out.println("preda ceva");
    }
}
