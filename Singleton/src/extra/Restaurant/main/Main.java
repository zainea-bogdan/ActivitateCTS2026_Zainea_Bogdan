package extra.Restaurant.main;

import extra.Restaurant.clase.Restaurant;

public class Main {
    public static void main(String[] args) {
        Restaurant rest1 = Restaurant.getInstance("test1",5,3);
        Restaurant rest2 = Restaurant.getInstance("test2",500,3);

        rest1.rezervaMasa();
        rest1.rezervaMasa();
        rest2.rezervaMasa();
        rest2.rezervaMasa();
    }
}
