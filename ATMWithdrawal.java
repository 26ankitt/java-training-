import java.util.Scanner;
public class ATMWithdrawal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Balance:");
        double bal = sc.nextDouble();
        System.out.println("Withdraw:");
        double amt = sc.nextDouble();

        if(bal>=1000){
            if(bal >= amt && bal-amt>=1000){
                System.out.println("Transaction Successful");
            }
            else{
                System.out.println("Minimum Balance Violation");
            }
        }else{
            System.out.println("Minimum Balance Violation");
        }
    }
}
