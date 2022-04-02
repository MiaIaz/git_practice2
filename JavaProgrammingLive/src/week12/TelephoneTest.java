package week12;

public class TelephoneTest {

    // no constructor means that we will use default constructor

    public String number;

    public static int quantity;

    public static double total;

    static {
        quantity = 250;
        total = 15658.92;
    }

    public void setNumber(String number){
        this.number= number;
    }

    public String getNumber(){
        return this.number;
    }


}
