public class Zadanie2_Malewski {
    class KoloUtils{
        public static final double PI = 3.14159;
        public static double obwod(double promien) {
            if (promien < 0.0) {
                throw new IllegalArgumentException("Promień jest mniejszy niż 0");
            }
            return (2*PI*promien);
        }
        public static double pole(double promien) {
            if (promien < 0.0) {
                throw new IllegalArgumentException("Promień jest mniejszy niż 0");
            }

            return (PI* Math.pow(promien,2));
        }
        public static int porownajPole(double r1, double r2) {
            if (r1 < 0.0 || r2 < 0.0) {
                throw new IllegalArgumentException("Promień jest mniejszy niż 0");
            }

            double p1 = pole(r1);
            double p2 = pole(r2);

            if (p1 > p2) {return 1;}
            if (p1 < p2) {return -1;}
            else {return 0;}
        }
    }
    public static void main(String[] args) {
        double r1 = 3;
        double r2 = 7;

        System.out.println("Obwód r1: "+KoloUtils.obwod(r1)+" Obwód r2: "+KoloUtils.obwod(r2));
        System.out.println("Pole r1: "+KoloUtils.pole(r1)+" Pole r2: "+KoloUtils.pole(r2));

        int cmp = KoloUtils.porownajPole(r1,r2);

        if (cmp == 0) {System.out.println("Pola są równe.");}
        else if (cmp > 0) {System.out.println("Koło o r1="+r1+" jest większe");}
        else {System.out.println("Koło o r2="+r2+" jest większe");}
    }
}
