import java.util.Scanner;
public class CabFareSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Distance:");
        double dist = sc.nextDouble();
        System.out.println("Night:");
        String st = sc.next().toLowerCase();
        double fare;

        if(dist<=5){
            fare = 50*dist;
        }
        else if(dist>5 && dist<=10){
            fare = (50*5) + ((dist-5)*40);
        }
        else{
            fare = (50*5) + (5*40) + ((dist-10)*30);
        }

        if(st == "night"){
            fare += .20;
        }
        System.out.println("Fare: " +fare);
    }
}
