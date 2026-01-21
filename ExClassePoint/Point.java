package ExClassePoint;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }   
    public double getY() {
        return y;
    }
    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void seDeplacer(double _newX, double _newY) {
        this.x = _newX;
        this.y = _newY;
    }

    public Point permuter(Point unPoint){
        // x=this.y;
        // y=this.x;
        // return new Point(x,y);
        return new Point(this.y,this.x);
    }

    

    public Point symAbcisse() {
        return new Point(-this.x, this.y);
    }

    public Point symOrdonnee() {
            return new Point(this.x, -this.y);
        }
    
    public Point symOrigine() {
        return new Point(-this.x, -this.y);
    }


}