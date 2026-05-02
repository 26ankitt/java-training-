public class CallByVal {
    static void add(int a, double b, String msg){
        double c = a+b;
        //a = 50;
        //b = 20.0;
        msg = "xyz";
        System.out.println("Sum: " + c + msg);
    }
    public static void main(String[] args) {
        int a = 10;
        double b = 20.0;
        String msg = "Hello";

        add(a,b,msg);

        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("Message: " + msg);
        
        //CallByValue obj = new CallByValue();
        //obj.add(a,b);        
    }    
}