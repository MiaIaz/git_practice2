package day09;

public class CharacterIdentity {
    public static void main(String[] args) {

        char ch = 'H' ;

        if ((ch>64 && ch<=90) || (ch>96&&ch<=122)){
            System.out.println("Alphabetic Character");
        }
        else if (ch>=48 && ch<=57){
            System.out.println("Digit character");
        }

        else {
            System.out.println("Special character");
        }

    }
}
/*
4. Create a class called Character Identity,
 and write a program that can identify if the given
 character is a digit or Alphabetic Character(A~Z or a~z)
 or a special character

		Ex:
			ch = '@'

		output:
			Special Character

		HINT: You may wanna check out the numbers of the
		 chracters on ASCII table

 */
