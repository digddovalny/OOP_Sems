package Sem1;

public class Main {
    public static void main(String[] args) {
        WendingMachine WM = new WendingMachine();
        WM.addProduct(new Product("картошка", 20));
        WM.addProduct(new Product("морковь", 30));
        WM.addProduct(new Drink("nastea", 40, 0.5, TypesOfDrink.COLDTEA));
        WM.addProduct(new Chocolate("alpengold", 40, 50));

        System.out.println(WM);

    }
}