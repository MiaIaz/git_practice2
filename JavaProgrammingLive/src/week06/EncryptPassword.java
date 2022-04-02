package week06;

public class EncryptPassword {
    public static void main(String[] args) {

        String password = "cydeo";
        char encryptWithChar = 'x';
        String encryptedPassword = "";
        for (int i = 0; i < password.length(); i++) {
encryptedPassword += ""+ password.charAt(i)+ encryptWithChar;
        }
        System.out.println("encryptedPassword = " + encryptedPassword);

    }
}
/**
 * 5.
 * Given a string password. Encrypt with "x" a given password
 * and print.
 * (do with for loop)
 * password: cydeo
 * encrypt with char :x
 * output:cxyxdxexox
 */
