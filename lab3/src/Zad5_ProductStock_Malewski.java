public class Zad5_ProductStock_Malewski {
    private String name;
    private double price;
    private int quantity;

    public void setName(String name) {this.name = name;}
    public void setPrice(double price) {this.price = price;}
    public void setQuantity(int quantity) {this.quantity = quantity;}

    public String getName() {return name;}
    public double getPrice() {return price;}
    public int getQuantity() {return quantity;}
    public String describe() {return String.format("Produkt=%s\nCena=%f \nIlość=%d\n",name,price,quantity);}
    public static void transferQuantity(Zad5_ProductStock_Malewski from, Zad5_ProductStock_Malewski to, int amount)
    {
        from.quantity -= amount;
        to.quantity += amount;
    }


    public static void main(String[] args) {
        Zad5_ProductStock_Malewski item1 = new Zad5_ProductStock_Malewski();
        Zad5_ProductStock_Malewski item2 = new Zad5_ProductStock_Malewski();

        item1.setName("Pomidor");
        item1.setPrice(5.20);
        item1.setQuantity(58);
        System.out.println(item1.describe());

        item2.setName("Cebula");
        item2.setPrice(3.15);
        item2.setQuantity(83);
        System.out.println(item2.describe());

        transferQuantity(item2,item1,20);
        System.out.println(item1.describe());
        System.out.println(item2.describe());
    }
}
