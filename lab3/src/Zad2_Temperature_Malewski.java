public class Zad2_Temperature_Malewski {
    private double celsius;
    public double getCelsius() {return celsius;}
    public void setCelsius(double c) {celsius = c;}
    public double getFahrenheit() {return toFahrenheit(celsius);}
    private double toFahrenheit(double c) {return (c*9/5)+32;}

    public static void main(String[] args) {
        double c1 = 32;
        double c2 = 68;
        double c3 = 3;
        Zad2_Temperature_Malewski t = new Zad2_Temperature_Malewski();

        t.setCelsius(c1);
        System.out.println("C = "+t.getCelsius());
        System.out.println("F = "+t.getFahrenheit());

        t.setCelsius(c2);
        System.out.println("C = "+t.getCelsius());
        System.out.println("F = "+t.getFahrenheit());

        t.setCelsius(c3);
        System.out.println("C = "+t.getCelsius());
        System.out.println("F = "+t.getFahrenheit());
    }
}
