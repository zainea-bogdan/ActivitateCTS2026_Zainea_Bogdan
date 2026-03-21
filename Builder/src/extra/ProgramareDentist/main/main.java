package extra.ProgramareDentist.main;

import extra.ProgramareDentist.clase.AbstractBuilder;
import extra.ProgramareDentist.clase.ProgramareDentist;

public class main {
    public static void main(String[] args) {
        AbstractBuilder programatorDentistBuilder = new ProgramareDentist.PrgDentistBuilder("Gica");

        ProgramareDentist prg1 = ((ProgramareDentist.PrgDentistBuilder) programatorDentistBuilder).setAreDetartare(true).setAreNevoieDeAnestezie(true).build();



        System.out.println(prg1.toString());
    }
}
