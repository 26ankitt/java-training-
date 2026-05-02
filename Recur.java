public class Recur {
    static void recur(int a){
        if(a<5){
        System.out.println(a);
        a++;
        recur (a);
        }
    }   
    public static void main(String[] args) {
        recur(2); //Initialization
    }
} 