import java.util.Scanner;

public class PasswordStrength {
    static boolean PassCheck(String pass) {
        if (pass.length() < 8) {
            return false;
        }
        boolean hasDigit = false;
        boolean hasUpper = false;
        boolean validChar = true;

        for (int i = 0; i < pass.length(); i++) {
            char ch = pass.charAt(i);

            if (Character.isDigit(ch)) {
                hasDigit = true;
            }

            if (Character.isUpperCase(ch)) {
                hasUpper = true;
            }

            if (!Character.isLetterOrDigit(ch)) {
                validChar = false;
            }
        }

        return hasDigit && hasUpper && validChar;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Password:");
        String pass = sc.next();

        boolean result = PassCheck(pass);

        if (result) {
            System.out.println("Strong Password");
        } else {
            System.out.println("Weak Password");
        }
    }
}