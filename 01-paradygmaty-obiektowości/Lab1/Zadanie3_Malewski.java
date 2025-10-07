public class Zadanie3_Malewski {
    class MathUtils{
        public static double max(int a, int b) { return (a > b) ? a : b; }
        public static double min(int a, int b) { return (a < b) ? a : b; }
        public static double avg(int a, int b) { return (a + b)/2.0; }
    }
    public static void main(String[] args) {
        int a = 7;
        int b = 12;
        System.out.println("max(7, 12) = "+MathUtils.max(a,b));
        System.out.println("min(7, 12) = "+MathUtils.min(a,b));
        System.out.println("avg(7, 12) = "+MathUtils.avg(a,b));
    }
}
