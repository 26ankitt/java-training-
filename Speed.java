import java.util.Scanner;
public class Speed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Speed:");
        double speed = sc.nextDouble();
        System.out.println("Repeated?: ");
        String rep = sc.next().toLowerCase();
        double fine =0;

        if(speed>80 && speed<100){
            fine+=100;
        }
        else if(speed>100){
            fine+=1000;
        }
        if(rep == "yes"){
            fine+=fine;
        }

        System.out.println("Fine: " +fine);
    }
}
