package s6.main;

import s6.clase.Rezervare;
import s6.clase.RezervareaAbstracta;

public class main {
    public static void main(String[] args) {
        RezervareaAbstracta rez1 = new Rezervare("Ana", 20, 13, "0788888888");
        RezervareaAbstracta rez2 = (Rezervare) rez1.clone();

        ((Rezervare)rez2).setOraRezervare(10);
        ((Rezervare)rez2).setZiuaRezervarii(10);

        System.out.println(rez1.toString());
        System.out.println(rez2.toString());
    }
}
