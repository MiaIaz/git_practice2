package day35_Encapulation.credentialTask;

public class Credential {

    private String username,password;

    public Credential(String username, String password) {
        this.username = username;
        setPassword(password);
    }

    public boolean isStrongPassword(String password){
        boolean result = false;
        if(password.length()>=8 && !password.contains(" ")){
            int upperCase = 0, lowerCase = 0, special = 0, digit = 0;
            for (int i = 0; i < password.length(); i++) {
                if( Character.isUpperCase(password.charAt(i)) ){
                    upperCase++;
                }
                if( Character.isLowerCase(password.charAt(i)) ){
                    lowerCase++;
                }
                if( Character.isDigit(password.charAt(i)) ){
                    digit++;
                }
                if( !Character.isLetterOrDigit(password.charAt(i)) ){
                    special++;
                }
            }
            if(upperCase>=1&&lowerCase>=1&&digit>=1&&special>=1){
                result = true;
            }else{
                result = false;
            }
        }else{
            System.out.println("Invalid password");
            System.exit(0);
        }
        return result;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        if( !(isStrongPassword(password))) {
            System.out.println("It must be a strong password!");
            System.exit(0);
        }
        this.password = password;
    }

    public String toString() {
        return "Credentials{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

}
/*
2. create a class named Credentials
Variables:
username, password
Methods:
isStrongPassWord(): takes an argument of string and verify
if the given string is strong password
Characteristics of strong passwords are:
1. Password MUST be at least have 8
characters long, and should not
contain space
2. PassWord should at least contain
one letter
3. Password should at least contain
one special characters
4. Password should at least contain a
digit
getPassword(): reads the password
getUsername(): reads the username
setUsername(): sets the username
setPassword(): sets a new password
the new password MUST be a strong
password
toString():
Add a constructor that allows user to set all the fields when
the object is created.
(If the arguments not valid it should not be set
to the instances)
 */