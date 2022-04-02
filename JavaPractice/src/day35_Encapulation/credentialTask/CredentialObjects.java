package day35_Encapulation.credentialTask;

public class CredentialObjects {

    public static void main(String[] args) {

        Credential password1 = new Credential("Mia","12527MIS");
        System.out.println(password1);
        System.out.println(password1.isStrongPassword(password1.getPassword()));
    }

}
