package extra.ClassroomKeeper.main;

import extra.ClassroomKeeper.clase.ClassroomKeeper;

public class main {
    public static void main(String[] args) {
        ClassroomKeeper keeper1 = ClassroomKeeper.getInstance("gica",10,8);
        ClassroomKeeper keeper2 = ClassroomKeeper.getInstance("gica2",100,8);

        keeper1.rezervaSala();
        keeper2.rezervaSala();

        keeper1.rezervaSala();
        keeper2.rezervaSala();
    }
}
