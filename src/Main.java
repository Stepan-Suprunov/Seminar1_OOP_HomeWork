// Домашнее задание к семинару №1 Объектно-ориентированное программирование Супрунов Степан


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product bottleOfWatter1 = new BottleOfWatter(11, "Watter1", "Brand1.1", 1.1, 1.11);
        Product bottleOfWatter2 = new BottleOfWatter(12, "Watter2", "Brand1.2", 1.2, 1.22);
        Product bottleOfMilk1 = new BottleOfMilk(21, "Milk1", "Brand2.1", 2.1, 2.111, 2.11);
        Product bottleOfMilk2 = new BottleOfMilk(22, "Milk2", "Brand2.2", 2.2, 2.222, 2.22);
        Product chocolate1 = new Chocolate(31, "Chocolate1", "Brand3.1", 111, 3.11);
        Product chocolate2 = new Chocolate(32, "Chocolate2", "Brand3.2", 222, 3.22);

        List<Product> products = new ArrayList<>();
        products.add(bottleOfWatter1);
        products.add(bottleOfWatter2);
        products.add(bottleOfMilk1);
        products.add(bottleOfMilk2);
        products.add(chocolate1);
        products.add(chocolate2);

        VendingMachine.vendingMachine(products);
    }
}