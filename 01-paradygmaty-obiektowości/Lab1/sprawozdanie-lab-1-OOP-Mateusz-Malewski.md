## I. Dokumentacja do lab. nr 1 - "Klasy oraz ich elementy składowe, metody klasy"
## II. Mateusz Malewski - grupa 1, semestr III
## III. Przedmiot - "Programowanie obiektowe"

## IV. Opis zadania do realizacji
Do zrealizowania były następujące zadania:  
  - Zadanie 1. Demo metod statycznych <br>
    • Utwórz klasę pomocniczą DemoMetod, w której będą wyłącznie publiczne metody statyczne: info(), przywitaj(String imie). <br>
    • W metodzie main pokaż wywołania obu metod bez tworzenia obiektów.  
  - Zadanie 2. Koło – obwód i pole jako funkcje statyczne <br>
    • Utwórz klasę pomocniczą KoloUtils z publiczną stałą public static final double PI = 3.14159. <br>
    • Dodaj publiczne statyczne metody: obwod(double promien) oraz pole(double promien) z prostą walidacją promienia (> 0). <br>
    • Dodaj publiczną statyczną metodę porownajPole(double r1, double r2), która zwróci 1 gdy pierwsze ma większe pole, -1 gdy drugie, 0 gdy równe,
    można skorzystać z metody compare, <br>
    • W metodzie main zademonstruj działanie metod na kilku przykładach. <br>
    • Można rzucić wyjątek dla niedodatnich promieni.
  - Zadanie 3. MathUtils – tylko publiczne metody statyczne <br>
    • Utwórz klasę pomocniczą MathUtils (zwykłą, nieabstrakcyjną, bez konstruktora) z metodami: max(int a, int b), min(int a, int b), avg(int a, int b) zwracającą średnią (double). <br>
    • Pokaż użycie w metodzie main – wywołania bez tworzenia obiektu. <br>
    • Można użyć ternary operator.  <br>
  - Zadanie 4. Kalkulator – podstawowe operacje (statyczne) <br>
    • Utwórz klasę pomocniczą CalcUtils zawierającą wyłącznie publiczne metody statyczne: add(double a, double b), sub(double a, double b), mul(double a, double b), div(double a, double b) – jeśli b == 0, rzuć IllegalArgumentException, oraz pow(double a, int n) do potęgowania całkowitego n≥0. <br>
    • W metodzie main zademonstruj działania kalkulatora na kilku przykładach, bez tworzenia obiektów. <br>
    • Rzucanie wyjątku przy dzieleniu przez zero. <br>


## V. Technologie wykorzystane w zadaniu
  - Java.


## VI. Realizacja zadania

## Zadanie 1

### 1. Kod Javy 
W zadaniu 1 wykorzystano klase pomocniczą DemoMethod i metody info i przywitaj.

Kod wykorzystany do rozwiązania zadania (zadań):  

```java
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
```

### 2. Zrzuty ekranu pokazujące wynik działania aplikacji/skryptu:  
![dowolny tekst alterntywny](../Lab152972/img.png)

<br>

## Zadanie 2

### 1. Kod Javy
W zadaniu 2 wykorzystano klase pomocniczą KoloUtils, z statyczną stałą PI i metody obwod, pole i porownajPole.

Kod wykorzystany do rozwiązania zadania (zadań):

```java
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
```

### 2. Zrzuty ekranu pokazujące wynik działania aplikacji/skryptu:
![dowolny tekst alterntywny](../Lab152972/img_1.png)

<br>

## Zadanie 3

### 1. Kod Javy
W zadaniu 3 wykorzystano klase pomocniczą MathUtils i metody max, min, avg.

Kod wykorzystany do rozwiązania zadania (zadań):
```java
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
```

### 2. Zrzuty ekranu pokazujące wynik działania aplikacji/skryptu:
![dowolny tekst alterntywny](../Lab152972/img_2.png)


<br>

## Zadanie 4

### 1. Kod Javy
W zadaniu 4 wykorzystano klase pomocniczą CalcUtils i metody add, sub, mul, div.

Kod wykorzystany do rozwiązania zadania (zadań):
```java
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
```

### 2. Zrzuty ekranu pokazujące wynik działania aplikacji/skryptu:
![dowolny tekst alterntywny](../Lab152972/img_3.png)


<br>

## III. Dodatkowe informacje o zadaniu
Można tu wpisać informacje o elementach, które nie zostały wymienione we wcześniejszych punktach.  Mozna też pominąć ten punkt, eśli nie ma potrzeby jeg użycia.  

#### 1. Tabele w Markdownie

| Syntax        | Description     |
|:-------------:|:---------------:|
|    Header     |      Title      |
|   Paragraph   |      Text       |
<br>

#### 2. Linki
  - do stron: What is a [markup language](https://www.semrush.com/blog/markup-language/)?
  - do innych sekcji w dokumencie: 
      - w miejscu, do którego chcemy się przenieść tworzymy znacznik `a` z atrybutem `id`, czyli np. `<a id="start"></a>`,  
      - tworzymy link do ww. znacznika za pomocą składni `[tekst linku](#id-w-znaczniku-a)`, w naszym przypadku może to być np. [Link do początku dokumentacji](#start).  
<br>
  
#### 3. Inne
  - wpisujemy informacje dotyczące zadania, które uważamy za istotne,  
  - ...