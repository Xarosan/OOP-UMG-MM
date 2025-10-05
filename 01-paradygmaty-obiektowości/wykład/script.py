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
