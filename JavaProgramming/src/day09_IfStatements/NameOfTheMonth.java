package day09_IfStatements;

public class NameOfTheMonth {
        public static void main(String[] args) {
            int month = 2;

            boolean month31 = month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12;
            boolean month30 = month==4 || month==6 || month==9 || month==11;
            boolean month28 = month==2;

            if(month31) {
                System.out.println("31 Days");
            }
            if(month30) {
                System.out.println("30 Days");
            }
            if(month28) {
                System.out.println("28 Days");
            }
        }




}
