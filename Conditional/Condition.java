package Conditional;

public class Condition {
    public static void main(String args[]){
        IF();
        IF_ELSE();
        IF_ELSE_LADDER();
    }

    public static void IF(){
        //check the number is greater than 50 or not
        int num = 100;
        if(num>=50){
            System.out.println("Number is greater than 50");
        }
    }

    public static void IF_ELSE(){
        // check the number is prime or not
        int num = 43;
        if(num%2==0){
            System.out.println(num+" is prime number");
        }
        else{
            System.out.println(num+" is not prime number");
        }
    }

    public static void IF_ELSE_LADDER(){
        int Month = 10;
        String MonthName = "";
        if(Month == 1){
            MonthName = "JAN";
        }
        else if(Month == 2){
            MonthName = "FEB";
        }
        else if(Month == 3){
            MonthName = "MARCH";
        }
        else if(Month == 4){
            MonthName = "APRIL";
        }
        else if(Month == 5){
            MonthName = "MAY";
        }
        else{
            MonthName = "OTHERS";
        }
        System.out.println(MonthName);
    }
}
