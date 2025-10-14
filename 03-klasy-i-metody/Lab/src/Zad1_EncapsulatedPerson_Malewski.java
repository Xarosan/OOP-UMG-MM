public class Zad1_EncapsulatedPerson_Malewski {
    public static String opisOsoby(String name, int age) {
        return (String.format("Osoba: %s, wiek %d",name,age));
    }
    public static void main(String[] args) {

        System.out.println(opisOsoby("Mateusz Malewski",22));
        System.out.println(opisOsoby("Piotr Kowalski",56));
        System.out.println(opisOsoby("Natalia Nowak",34));
    }
}
