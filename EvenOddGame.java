import java.util.Scanner;
public class EvenOddGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input:");
        int even = 0;
        int odd = 0;

        while(true){
            int num = sc.nextInt();
            if(num==0){
                break;
            }
            else if(num%2==0){
                even++;
            }
            else{
                odd++;
            }
        }

        System.out.println("Even: " +even);
        System.out.println("Odd: " + odd);

        sc.close();
    }
}
