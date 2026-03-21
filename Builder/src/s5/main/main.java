package s5.main;

import s5.clase.AbstractBuilder;
import s5.clase.Internare;

public class main {
    public static void main(String[] args) {
        // A1 A.1. Atunci când un pacient este internat in cadrul aplicației se face salvarea acestuia. Fiecare
        //pacient are posibilitatea sa plătească extra pentru anumite facilitate precum: pat rabatabil, mic
        //dejun inclus, papuci de camera, halat pentru interior. In cazul in care pacientul nu alege aceste
        //facilitați extra, in cadrul aplicației sunt setate cu false. Să se dezvolte modulul care asigură crearea
        //de obiecte de tipul pacient cu opțiuni extra.

        AbstractBuilder builder = new Internare.InternareBuilder("Gica");

        ((Internare.InternareBuilder) builder).setNume("Gicutu");

        Internare int1 = builder.build();
        System.out.println(int1.toString());

    }
}
