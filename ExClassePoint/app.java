package ExClassePoint;

import java.util.Random;

public class app {
    public static void main(String[] args) {
        Point p1 = new Point(2,3);
        Point p2 = new Point(4,5);

        System.out.println("Point p1 : (" + p1.getX() + "," + p1.getY() + ")");
        System.out.println("Point p2 : (" + p2.getX() + "," + p2.getY() + ")");

        Point p3 = p1.permuter(p2);
        System.out.println("Point p3 (permutation de p1) : (" + p3.getX() + "," + p3.getY() + ")");

        Point p4 = p1.symAbcisse();
        System.out.println("Point p4 (symétrie par rapport à l'axe des abscisses de p1) : (" + p4.getX() + "," + p4.getY() + ")");

        Point p5 = p1.symOrdonnee();
        System.out.println("Point p5 (symétrie par rapport à l'axe des ordonnées de p1) : (" + p5.getX() + "," + p5.getY() + ")");

        Point p6 = p1.symOrigine();
        System.out.println("Point p6 (symétrie par rapport à l'origine de p1) : (" + p6.getX() + "," + p6.getY() + ")");
    
        Point p7 = p1.distancePoint(p2);
        System.out.println("Point p7 (symétrie par rapport à l'origine de p1) : (" + p7.getX() + "," + p7.getY() + ")");

    }
}
