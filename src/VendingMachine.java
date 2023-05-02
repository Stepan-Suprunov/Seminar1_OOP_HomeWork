import java.util.List;
import java.util.Scanner;

public class VendingMachine {

    public static void vendingMachine(List<Product> list) {
        System.out.println("Inset Product Article: ");
        Scanner scanner = new Scanner(System.in);
        int userArticle = scanner.nextInt();
        boolean flag = false;
        for (Product product : list) {
            if (product.getArticle() == userArticle) {
                System.out.println("You purchased: " + product.displayInfo());
                flag = true;
            }
        }
        if (!flag)
            System.out.println("Product is missing");
    }
}
