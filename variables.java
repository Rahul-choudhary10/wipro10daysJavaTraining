public class variables{
    public static void main(String args[]){
        var();
    }
    public static void var(){
        int a = 10;
        int b = 20;
        System.out.println("Before swapping : "+ "a = "+a+" b = "+b);
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("After swapping : "+ "a = "+a+" b = "+b);
    }
}
 