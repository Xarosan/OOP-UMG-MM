public class wyk3 {
    public static class Osoba {
        private int wiek;
        private String imie, nazwisko;

        public void ustawWiek(int newWiek) { wiek = newWiek; }
        public void ustawImie(String newImie) { imie = newImie; }
        public void ustawNazwisko(String newNazwisko) { nazwisko = newNazwisko; }

        public String toString() {
            return String.format("Imie: %s%nNazwisko: %s%nWiek: %d", imie, nazwisko, wiek);
        }
    }

    public static void main(String[] args) {
        Osoba koles = new Osoba();
        koles.ustawImie("Jan");
        koles.ustawNazwisko("Nowak");
        koles.ustawWiek(32);
        System.out.println(koles);

    }
}
