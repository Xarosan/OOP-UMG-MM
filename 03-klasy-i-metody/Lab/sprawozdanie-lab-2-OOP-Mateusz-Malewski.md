## I. Dokumentacja do lab. nr 1 - "Klasy oraz ich elementy składowe, metody klasy"
## II. Imię i nazwisko - grupa ABC, semestr III
## III. Przedmiot - "Programowanie obiektowe"

## IV. Opis zadania do realizacji
Do zrealizowania były następujące zadania:  
1. Napisz klasę `Zad1_EncapsulatedPerson_Nazwisko` z metodą publiczną statyczną: `opisOsoby(String name, int age)` — zwraca napis w formacie: "Osoba: <imię>, wiek: <wiek>".;
2. Napisz klasę `Zad2_BankAccount_Nazwisko`,
   - Przyjmij, że „stan konta” to pola statyczne (np. `owner`, `balance`).
   - Zapewnij publiczne metody: `reset(String newOwner, double initialBalance)`, `deposit(double amount)`, `withdraw(double amount)`, `getBalance()` (opcjonalnie `getOwner()`).
3. Napisz klasę `Zad3_Rectangle_Nazwisko`,
   - Dodaj statyczne pola przechowujące stan: `width` oraz `height`.
   - Zapewnij publiczne metody dostępowe: settery `setWidth(double)`, `setHeight(double)` oraz gettery `getWidth()`, `getHeight()`.
   - Udostępnij dwie formy obliczeń:
       - funkcje na parametrach: `area(double width, double height)`, `perimeter(double width, double height)`,
       - funkcje korzystające z aktualnego stanu: `area()`, `perimeter()` (działają na `width` i `height` ustawionych setterami). 
4. Napisz klasę `Zad4_ImmutablePoint_Nazwisko`,
   - Reprezentuj punkt jako parę liczb `(x, y)` przekazywaną parametrami i zwracaną jako tablica `double[2]`.
   - Zaimplementuj:
       - `movedBy(double x, double y, double dx, double dy)` — zwraca nowy punkt przesunięty o `(dx, dy)`;
       - `formatPoint(double x, double y)` — zwraca napis w stylu "(x, y)".

## V. Technologie wykorzystane w zadaniu
  - Java

## VI. Realizacja zadania
<br>

### Zadanie 1

#### 1. Kod Javy (lub Pythona)
W zadaniu wykorzystano .... (krótko opisać, co zostało użyte).

Kod wykorzystany do rozwiązania zadania (zadań):  

```java
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
```

#### 2. Zrzuty ekranu pokazujące wynik działania aplikacji/skryptu:  
![dowolny tekst alterntywny](../images/dandelion.jpg)

<br>


### Zadanie 2

#### 1. Kod Javy (lub Pythona)
W zadaniu wykorzystano .... (krótko opisać, co zostało użyte).

Kod wykorzystany do rozwiązania zadania (zadań):

```java
public class Zad2_BankAccount_Malewski {
    private static String owner;
    private static double balance;
    public static void reset(String newOwner, double initialBalance) {
        owner = newOwner;
        balance = initialBalance;
    }
    public static void deposit(double amount) { balance += amount; }
    public static void withdraw(double amount) { balance -= amount;}
    public static double getBalance() { return balance; }
    public static String getOwner() { return owner; }

    public static void main(String[] args) {
        reset("Malewski",12000);

        System.out.println(getOwner());
        System.out.println(getBalance());

        deposit(346.75);
        System.out.println(getBalance());

        withdraw(2600.63);
        System.out.println(getBalance());
    }
}
```

#### 2. Zrzuty ekranu pokazujące wynik działania aplikacji/skryptu:
![dowolny tekst alterntywny](../images/dandelion.jpg)

<br>


### Zadanie 3

#### 1. Kod Javy (lub Pythona)
W zadaniu wykorzystano .... (krótko opisać, co zostało użyte).

Kod wykorzystany do rozwiązania zadania (zadań):

```java
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
```

#### 2. Zrzuty ekranu pokazujące wynik działania aplikacji/skryptu:
![dowolny tekst alterntywny](../images/dandelion.jpg)

<br>


### Zadanie 4

#### 1. Kod Javy (lub Pythona)
W zadaniu wykorzystano .... (krótko opisać, co zostało użyte).

Kod wykorzystany do rozwiązania zadania (zadań):

```java
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
```

#### 2. Zrzuty ekranu pokazujące wynik działania aplikacji/skryptu:
![dowolny tekst alterntywny](../images/dandelion.jpg)

<br>

