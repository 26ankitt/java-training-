import java.util.Scanner;
public class Vending{
    public static void main(String[] args) {
        int total = 0;
        System.out.println("Tray 1 | Beverages");
        System.out.println("Tray 2 | Snacks");
        System.out.println("Tray 3 | Chocolates");

        Scanner sc = new Scanner(System.in);
        System.out.println("Select your tray by using(1/2/3/0(Exit)");
        int trayNo = sc.nextInt();

        switch(trayNo){
            case 1:{
                char stay;
                do{
                    System.out.println("a. Coca-Cola 30/-");
                    System.out.println("b. Sprite 60/-");
                    System.out.println("c. Mazza 50/-");

                    System.out.println("Items to purchase(a/b/c):");
                    char prod = sc.next().charAt(0);

                    if(prod=='a')
                        total += 30;
                    else if(prod=='b')
                        total += 60;
                    else if(prod=='c')
                        total += 50;

                    System.out.println("Stay on the same tray(y/n) :");
                    stay = sc.next().charAt(0); 
                }          
                while(stay != 'n');
                break;
            }

            case 2:{
                char stay;
                do{
                    System.out.println("a. 5-Star 30/-");
                    System.out.println("b. Kitkat 60/-");
                    System.out.println("c. Cadbury 50/-");

                    System.out.println("Items to purchase(a/b/c):");
                    char prod = sc.next().charAt(0);

                    if(prod=='a')
                        total += 30;
                    else if(prod=='b')
                        total += 60;
                    else if(prod=='c')
                        total += 50;

                    System.out.println("Stay on the same tray(y/n) :");
                    stay = sc.next().charAt(0); 
                }          
                while(stay != 'n');
                break;
            }

            case 3:{
                char stay;
                do{
                    System.out.println("a. Kurkure 30/-");
                    System.out.println("b. Lays 60/-");
                    System.out.println("c. Tanmay 50/-");

                    System.out.println("Items to purchase(a/b/c):");
                    char prod = sc.next().charAt(0);

                    if(prod=='a')
                        total += 30;
                    else if(prod=='b')
                        total += 60;
                    else if(prod=='c')
                        total += 50;

                    System.out.println("Stay on the same tray(y/n) :");
                    stay = sc.next().charAt(0); 
                }          
                while(stay != 'n');
                break;
            }

            default:
                System.out.println("Invalid");
                break;
        }
        System.out.println("Total: " + total);
    }
}