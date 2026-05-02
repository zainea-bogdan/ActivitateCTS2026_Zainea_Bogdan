package s9.clase;

public class ReceptieSpital {
    private Medic medic;
    private Salon salon;

    public ReceptieSpital(Medic medic, Salon salon) {
        this.medic = medic;
        this.salon = salon;
    }

    public void interneazaPacient(Pacient pacient){
        if(this.medic.areTrimitere(pacient)){
            int patLiber=this.salon.getPatLiber();

            if(patLiber!=-1){
                System.out.println("Pacientul "+pacient.getNume()+" va fi internat in patul "+patLiber);
                salon.ocupaPat(patLiber);
            }else{
                System.out.println("Nu avem paturi libere, vei fi internat in alt salon");
            }
        }else{
            System.out.println("Ai nevoie de trimitere de la medic");
        }
    }
}
