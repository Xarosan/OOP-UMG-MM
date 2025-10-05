## I. Dokumentacja do wykładu. nr 1 - "Paradygmaty obiektowości"
## II. Mateusz Malewski - grupa lab 1, semestr III
## III. Przedmiot - "Programowanie obiektowe"

## IV. Opis zadania do realizacji
Do zrealizowania były następujące zadania:  
  - z pomocą dowolnego języka programowania napisz program, który po uruchomieniu:  
    - wyświetli w kolejności alfabetycznej nazwy czterech filarów OOP,  (Abstrakcja,Enkapsulacja,Dziedziczenie,Polimorfizm)
    - wyświetli w kolejności losowej nazwy czterech filarów OOP,  
    - w obu ww. przypadkach wskazane jest użycie wbudowanych w dany język programowania metod.  

## V. Technologie wykorzystane w zadaniu
  - Python

## VI. Realizacja zadania

#### 1. Kod Javy (lub Pythona)
W zadaniu wykorzystano moduł 'random' do losowania filarów. Każdy filar jest elementem listy 'Filary'. 

Kod wykorzystany do rozwiązania zadania (zadań):  



```python
import random

filary = [
    "Abstrakcja",
    "Enkapsulacja",
    "Dziedziczenie",
    "Polimorfizm"
]

# Alfabetycznie
abc = sorted(filary)
print("Alfabetycznie:", abc)

# Losowo
rand = filary[:]
random.shuffle(rand)
print("Losowo:", rand)

```

#### 2. Zrzuty ekranu pokazujące wynik działania aplikacji/skryptu:  
![Pierwszy Przykład](../images/img.png) <br>
Drugi screen żeby pokazać losowość:
![Drugi Przykład](../images/img_1.png)
