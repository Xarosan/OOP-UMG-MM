[Link](https://github.com/zacniewski/materials-about-OOP-in-Java-and-Python/) do Githuba na zajęcia<br>
[Markdown](https://www.markdownguide.org)
<br>

#Pythonowy Cheat Sheet z innych zajęć

### Tworzenie nowego projektu
```
dotnet new console
```
<br>

### Wypisywanie tekstu, wczytywanie danych (w tym wypatku INT)
```cs
Console.Write();
Console.WriteLine();
x = int.Parse(Console.ReadLine());
```
<br>

### Operator warunkowy

```cs
y = ( i > 2 ) ? 7 : -7;
```
*czyli y = 7 jeśli i > 2, w przeciwnym wypadku y = -7*
<br><br><br>
# Arrays
### Wczytywanie danych(liczb) po spacji i rozdzielenie ich na elementy tablicy
```cs
string str = Console.ReadLine();
double[] arr = Array.ConvertAll(str.Split(' '), new Converter<string, double>(double.Parse));
```
alternatywnie:
```cs
string str = Console.ReadLine();
String[] list = str.Split(" ");
// coś jeszcze tu musi być
```
# Arguments
### Wczytywanie argumentów
```cs
if(args.Length < 3) return;

double[] arr = new double[args.Length-4];

int a = 0; //array
int m = 0; //mode
int n = 0; //number
int i = 0;
int x = 0;

// check for arguments

foreach(string arg in args)
{
    switch(arg)
    {
        case "--array": 
        case "-a":
            a = i;
            break;
            

        case "--mode": 
        case "-m":
            m = i;
            break;
            
        
        case "--number":
        case "-n":
            n = i;
            break;  
    }
    i++;
}
```
Reszta kodu [tutaj](../main/arguments/arg2SW/Program.cs)
