import java.util.*;
public class Operators {


    public static void opertions(){
        System.out.println("Addition for Enter 1");
        System.out.println("Subtraction for Enter 2");
        System.out.println("Multiplication for Enter 3");
        System.out.println("Division for Enter 4");
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //Create a program that simulates a simple calculator using command-line arguments to perform and print the result of addition, subtraction, multiplication, and division..
        opertions();
        int enter = sc.nextInt();
        int num1 = 10;
        int num2 = 20;

        int val = 0;
        switch (enter) {
            case 1:
                val = num1 + num2;
                break;
            case 2:
                val = num1-num2;
                break;
            case 3:
                val = num1/num2;
                break;
            case 4:
                val = num1/num2;
                break;
            default:
                System.out.print("Choose correct option");
                break;
        }
        System.out.println(val);

    }
    
}
