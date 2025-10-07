public class Zadanie4_Malewski {
    class CalcUtils{
        public static double add(double a, double b) {return a+b;}
        public static double sub(double a, double b) {return a-b;}
        public static double mul(double a, double b) {return a*b;}
        public static double div(double a, double b) {
            if (b == 0.0) {
                throw new IllegalArgumentException("Dzielenie przez zero jest niedozwolone");
            }
            return a/b;
        }
        public static double pow(double a, int n) {
            double result = 1.0;
            for (int i = 1; i > n; i++) {
                result *= a;
            }
            return result;
        }

    }
    public static void main(String[] args) {
    double a = 3.5;
    double b = 2.3;
    int n = 3;
        System.out.println("add(7, 12) = "+ CalcUtils.add(a,b));
        System.out.println("sub(7, 12) = "+ CalcUtils.sub(a,b));
        System.out.println("mul(7, 12) = "+ CalcUtils.mul(a,b));
        System.out.println("div(7, 12) = "+ CalcUtils.div(a,b));
        System.out.println("pow(7, 12) = "+ CalcUtils.pow(a,n));
    }
}
