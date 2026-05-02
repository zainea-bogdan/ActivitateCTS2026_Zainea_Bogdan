package s10_recuperare.main;

import s10_recuperare.clase.NotaDePlata;
import s10_recuperare.decorator.NotaDePlata1Mai;
import s10_recuperare.decorator.NotaDePlataDecorator;
import s10_recuperare.decorator.NotaDePlataPrintatNouAn;

public class main {
    public static void main(String[] args) {
        NotaDePlata notaDePlata=new NotaDePlata(300.00f, "9");
        notaDePlata.printeazaNotaDePlata();

        System.out.println("----------------------------------------------------------");
        NotaDePlataDecorator notaPlataAnulNou=new NotaDePlataPrintatNouAn(notaDePlata, "28-12-2025");
        NotaDePlataDecorator notaPlata1Mai=new NotaDePlata1Mai(notaDePlata);

        int a=1;

        if(a==1){
            notaPlata1Mai.printeazaFelicitare();
        }else notaPlataAnulNou.printeazaFelicitare();
    }
}
