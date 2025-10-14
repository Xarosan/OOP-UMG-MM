public class Zad3_Rectangle_Malewski {
    private static double width, height;
    public static void setWidth(double w) { width = w; }
    public static void setHeight(double h) { height = h; }
    public static double getWidth() {return width;}
    public static double getHeight() {return height;}
    public static double area() {return width*height;}
    public static double perimeter() {return 2*(width+height);}

    public static void main(String[] args) {

        setWidth(3);
        setHeight(7);

        System.out.println(area());
        System.out.println(perimeter());
    }

}
