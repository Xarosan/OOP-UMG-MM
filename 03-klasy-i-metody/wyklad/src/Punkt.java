public class Punkt {
    private int x , y ;

    public void ustawX( int wartoscX) {
        x = wartoscX;
    }

    public void ustawY( int wartoscY) {
        y = wartoscY;
    }

    public String toString() {
        return "X, Y: " + x + ", " + y ;
    }

    public static void main(String[] args) {
        Punkt a = new Punkt();
        Punkt b = new Punkt();
        a.ustawX( 10 );
        a.ustawY( 20 );
        b.ustawX( 0 );
        b.ustawY( 5 );
        System.out.println(a);
        System.out.println(b);
    }
}