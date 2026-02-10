public class Fraction {
    
    private int numerateur;
    private int denominateur;
    public Fraction (){
        this.numerateur = 1;
        this.denominateur = 1;
    }

    public Fraction (int _numerateur, int _denominateur){
        this.numerateur = _numerateur;
        this.denominateur = _denominateur;
        reduire();
    }


    public Fraction (int _numerateur){
        this.numerateur = _numerateur;
        this.denominateur = 1;
    }
    
    public int getNumerateur(){
        return numerateur;
    }

    public int getDenominateur(){
        return denominateur;
    }

    public void oppose(){
        this.numerateur=-numerateur;
    }

    public void inverse(){
        int temporaire = this.numerateur;
        this.numerateur=denominateur;
        this.denominateur = temporaire;
    }

    public boolean operateurSuperieur(Fraction _fractionCompa){
        if(this.numerateur > _fractionCompa.numerateur && this.denominateur > _fractionCompa.denominateur ){
            return true;
        }
        return false;
    }

    public boolean operateurInferieur(Fraction _fractionCompa){
        if(this.numerateur < _fractionCompa.numerateur && this.denominateur < _fractionCompa.denominateur ){
            return true;
        }
        return false;
    }
    
        public boolean operateurEgalite(Fraction _fractionCompa){
        if(this.numerateur == _fractionCompa.numerateur && this.denominateur == _fractionCompa.denominateur ){
            return true;
        }
        return false;
    }

    private int getPgcd()
    {
        int a = this.numerateur;
        int b = this.denominateur;
        int pgcd=-1;
        if ( a!=0 && b!=0)
        {
            if ( a<0 ) a =-a;
            if ( b<0 ) b =-b;
            while ( a!=b )
            if ( a<b )
            b -= a;
            else
            a -=b;
            pgcd = a;
        }
        return pgcd;
    }

    private void reduire(){
        int pgcd = getPgcd();
        this.denominateur/= pgcd;
        this.numerateur/=pgcd;

        if(this.denominateur<0){
            this.numerateur=-numerateur;
            this.denominateur=-denominateur;
        }

    }
}




