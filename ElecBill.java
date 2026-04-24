import java.util.Scanner;
public class ElecBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of units:");
        double units = sc.nextDouble();
        double bill=50;

        if(units>0 && units<=100){
            bill += units * 1.5;
        }
        else if(units>=101 && units<=200){
            bill += (100*1.5) + ((units-100)*3.5); 
        }
        else{
            bill += (100*1.5) + (100*3.5) + ((units-200)*5);
        }
        if(bill>2000){
            bill += bill * 0.10;
        }

        System.out.println("Total Bill: " + bill);
    }
}