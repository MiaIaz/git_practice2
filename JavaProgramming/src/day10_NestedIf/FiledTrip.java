package day10_NestedIf;

public class FiledTrip {
    public static void main(String[] args) {

        int grade = 2;
        String location = "";
        int groupNumber=0;
        String teacher = "";

        if(grade >=1 && grade <=6){

            if(grade ==1){
                location = "Apple Orchard";
                groupNumber = 3;
                teacher = "Ms Smith";
            }else if(grade == 2){
                location = "Zoo";
                groupNumber = 7;
                teacher = "Mr Lee";
            }else if(grade == 3){
                location = "Aquarium";
                groupNumber = 5;
                teacher = "Ms Wilson";
            }else if(grade == 4){
                location = "Movie theater";
                groupNumber = 2;
                teacher = "Ms Reyes";
            }else if(grade ==5){
                location = "Museum";
                groupNumber = 5;
                teacher = "Ms Lena";
            }else{
                location = "Six Flags";
                groupNumber = 8;
                teacher = "Mr Watt";
            }

        }else{
            System.out.println("Invalid Grade");
        }

        System.out.println("location = " + location);
        System.out.println("groupNumber = " + groupNumber);
        System.out.println("teacher = " + teacher);
        System.out.println("---------------------------------");

        System.out.println("location- "+location+"\ngroupNumber- "+groupNumber+"\nteacher in charge- "+teacher);
    }
}

        /*if(grade >=1 && grade <=6){

            if(grade ==1){
                System.out.println("location - Apple Orchard");
                System.out.println("Number of groups - 3");
                System.out.println("Teacher in charge - Ms.Smith");
            }

         */
