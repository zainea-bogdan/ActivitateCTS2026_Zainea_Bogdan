package s4.hotel.main;

import s4.hotel.clase.Hotel;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Hotel hotel1 = Hotel.getInstance("test",7,5);
        Hotel hotel2 = Hotel.getInstance("test1",200,0);

        hotel1.rezervaCamera();
        hotel1.rezervaCamera();

        hotel2.rezervaCamera();
        hotel2.rezervaCamera();
    }
}