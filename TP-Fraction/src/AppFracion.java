public class AppFracion {
    public static void main(String[] args) throws Exception {
    Fraction f1 = new Fraction ( 12, 7); // dans ce cas le numérateur vaudra 12 et le dénominateur 7
    Fraction f2 = new Fraction(); // fraction nulle de dénominateur 1
    Fraction f3 = new Fraction ( 120,-150 ); // fraction dont le numérateur vaut 9 et le dénominateur 1
    
    // Ecran.affiche(f1);
    // Ecran.affiche(f2);
    // Ecran.affiche(f3);

    // Fraction f = new Fraction(4,7);
    // Ecran.affiche(f);
    // System.out.println("-------------------Oppose-------------------");
    // f.oppose();
    // Ecran.affiche(f);
    // System.out.println("-------------------Inverse-------------------"); 
    // f.inverse();
    // Ecran.affiche(f);
    System.out.println("-------------------reduire-------------------"); 
    Ecran.affiche(f3);
    
    }
}
