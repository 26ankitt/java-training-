import java.util.Scanner;
public class Warehouse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of products:");
        int prod = sc.nextInt();

        int restockCount = 0;

        for (int i = 1; i <= prod; i++) {
            System.out.println("\nProduct " + i + ":");

            System.out.print("Enter current stock: ");
            int current = sc.nextInt();

            System.out.print("Enter minimum required stock: ");
            int min = sc.nextInt();

            if (current < min) {
                System.out.println("Restock Needed for product " + i);
                restockCount++;
            }
        }

        System.out.println("\nTotal products to restock: " + restockCount);

        sc.close();
    }
}
