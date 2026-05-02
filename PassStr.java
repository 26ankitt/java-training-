import java.util.Scanner;
public class PassStr {
    static void PassCheck(String pass){
        Scanner sc = new Scanner(System.in);
        boolean hasLength = false;
        boolean hasDigit = false;
        boolean hasUpperCase = false;
        boolean hasspec = false;
        boolean passStr = false;
        
        
        if(pass.length()>=8){
            hasLength = true;
        }
        else{
            hasLength = false;
            }

        for(int i=0 ; i<pass.length() ; i++){
            char ch = pass.charAt(i);
            if(Character.isDigit(ch)){
                hasDigit = true;
            }
        
            if(Character.isUpperCase(ch)){
                hasUpperCase = true;
            }
        
            if(Character.isLetterOrDigit(ch) && !Character.isWhitespace(ch)){
                hasspec = true;
            }
        }
        if(hasspec && hasDigit && hasUpperCase && hasLength){
            System.out.println("Strong Password");
        }
        else{
            System.out.println("Weak Password");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Password:");
        String pass = sc.next();
        String status;

        PassCheck(pass);
    }
}