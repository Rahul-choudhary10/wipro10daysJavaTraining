public class ControlFlow {
    public static void main(String args[]){
        //Write a Java program that reads an integer and prints whether it is a prime number using a for loop and if statements.
        CheckPrime();
        
    }

    public static void CheckPrime(){
        int num;
        for(int i =1; i<50; i++){
            if(i%2==0){
                System.out.println(i+" is PRIME NUMBER");
            }
        }
    }
}
