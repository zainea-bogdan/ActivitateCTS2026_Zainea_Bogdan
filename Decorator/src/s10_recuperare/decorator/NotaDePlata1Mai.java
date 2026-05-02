package s10_recuperare.decorator;

import s10_recuperare.clase.NotaDePlata;

public class NotaDePlata1Mai  extends NotaDePlataDecorator{
    public NotaDePlata1Mai(NotaDePlata notaDePlata) {
        super(notaDePlata);
    }

    @Override
    public void printeazaFelicitare() {
        this.printeazaNotaDePlata();
        System.out.println("Sper sa ai 1 mai fericit");
    }
}
