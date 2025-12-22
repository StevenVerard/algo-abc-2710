package Jalon;

public class Pb1 {
    public static void main(String[] args) {
        boolean a=true, b=true, c=false, calcul;
        calcul = a|| b && !c;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println("resulat :"+calcul );
    }
}
