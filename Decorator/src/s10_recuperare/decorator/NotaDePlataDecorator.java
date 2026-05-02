package s10_recuperare.decorator;

import s10_recuperare.clase.NotaDePlata;
import s10_recuperare.clase.NotaDePlataAbstracta;

public abstract  class NotaDePlataDecorator implements NotaDePlataAbstracta {
    protected NotaDePlata notaDePlata;

    public NotaDePlataDecorator(NotaDePlata notaDePlata) {
        this.notaDePlata = notaDePlata;
    }

    @Override
    public void printeazaNotaDePlata() {
        notaDePlata.printeazaNotaDePlata();
        System.out.println("Nota de plata emisa");
    }

    public abstract void printeazaFelicitare();
}
