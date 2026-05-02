import java.util.Scanner;
public class FraudTransaction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Amount:");
        int amt = sc.nextInt();
        System.out.println("Enter Location:");
        String loc = sc.next().toLowerCase();
        System.out.println("No. of Attempts:");
        int att = sc.nectInt();
        
        if(amt>50000 && loc=="no"){
            System.out.println("Fraud Detected.");
        }
        else if(att>3){
            System.out.println("Fraud Detected");
        }
        else{
            System.out.println("Transaction Successful");
        }
    }
}
