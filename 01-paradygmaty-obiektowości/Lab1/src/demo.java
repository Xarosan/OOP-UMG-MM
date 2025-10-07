public class demo {
    int x = 5;
    //final int x = 10;  //Będzie 10 nie ważne co
    public static void main(String[] args) {
    demo myObj = new demo();
    System.out.println(myObj.x);
    myObj.x = 10;
    System.out.println(myObj.x);
    }
}
