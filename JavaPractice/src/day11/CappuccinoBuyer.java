package day11;

public class CappuccinoBuyer {
    public static void main(String[] args) {

        String size ="venti";
        String result = "";

        switch (size){
            case "tall":
                result="price is $3.69" + "\n90 calories";
                break;
            case "grade":
                result="price is $3.99" + "\n120 calories";
                break;
            case "venti":
                result ="price is $4.29" +"\n150 calories";
                break;
            default:
                result="Invalid size";

        }
        System.out.println(result);
        System.out.println("====================================");

        String size2 = "grade";
        String result2 = "";

        if(size2 =="tall" || size2=="grade" || size2=="venti"){
            if(size2=="tall"){
                result2="price is $3.69 \n90 calories";
            }else if(size2=="grade"){
                result2="price is $3.99 \n120 calories";
            }else{
                result2="price is $4.29 \n150 calories";
            }
        }else{
            result2="Invalid size";
        }
        System.out.println(result2);

        System.out.println("===============================================");

         int number = 1;
         String result3 = "";

         boolean size3= number==1 || number==2 || number==3;

                 if(size3){
                 switch (number){

        case 1:
            result3="price is $3.69" + "\n90 calories";
            break;
        case 2:
            result3="price is $3.99" + "\n120 calories";
            break;
        default:
            result3 ="price is $4.29" +"\n150 calories";
            break;
    }
         }else{
            result3= "Invalid size";
    }
        System.out.println(result3);

    }
}
/*
1. Create a class called  CappuccinoBuyer.
A variable named Size is given, write a program that can display the price and calories of cappuccino
Valid sizes are tall, grande, venti and their price & calories are:
			tall:
			  price is $3.69
				90 calories

			grande:
				price is $3.99;
				120 calories

			venti:
			rice is $4.29
			150 calories

If the size is invalid then the output should be "Invalid Size"


			Note:
			 	Solution 1: use if statement
				Solution 2: use switch statement
				Solution 2: use if & switch statements mixed
 */