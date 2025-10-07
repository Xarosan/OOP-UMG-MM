public class Zadanie1_Malewski {
    class DemoMethod{
        public static void info() {System.out.println("Hello world");}
        public static void przywitaj(String imie) {System.out.println("Cześć "+imie);}
    }
    public static void main(String[] args) {
        DemoMethod.info();
        DemoMethod.przywitaj("Mateusz");
    }
}
