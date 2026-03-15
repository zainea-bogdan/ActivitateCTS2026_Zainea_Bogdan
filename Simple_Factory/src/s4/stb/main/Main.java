package s4.stb.main;

import s4.stb.fabrica.Depou;
import s4.stb.fabrica.Tipuri;
import s4.stb.familie_clase.MijlocTransport;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Depou depoul = new Depou();
        MijlocTransport autobuz = depoul.getMijlocTransport(Tipuri.AUTOBUZ,4,"B100STB");
        MijlocTransport tramvai = depoul.getMijlocTransport(Tipuri.TRAMVAI,20,"B101STB");
        MijlocTransport troleu = depoul.getMijlocTransport(Tipuri.TROLEIBUZ,4,"B102STB");

        autobuz.afiseazaDescriere();
        tramvai.afiseazaDescriere();
        troleu.afiseazaDescriere();
    }
}