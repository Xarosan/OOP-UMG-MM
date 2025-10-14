public class Zad4_ImmutablePoint_Malewski {
    private static double[] point;
    public static double[] movedBy(double x, double y, double dx, double dy) {
        return new double[] {x+dx,+y+dy};
    }
    public static String formatPoint(double x, double y) {

        return "( "+x+", "+y+" )";
    }

    public static void main(String[] args) {
        //punkt 1
        double x = 3, y = 4;
        System.out.println(formatPoint(x,y));

        //przeniesiony punkt
        double[] p1 = movedBy(x,y,7,8);
        System.out.println(formatPoint(p1[0],p1[1]));
    }

}
