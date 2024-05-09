
public class SimpleCal {
	public static void main(String args[]) {
		if (args.length != 3) {
            System.out.println("You have to enter the value in the below format..");
            System.out.println("Example: java SimpleCal 4 + 3");
        }
		int num1 = Integer.parseInt(args[0]);
        String operator = args[1];
        int num2 = Integer.parseInt(args[2]);
        
        Cal(num1, num2, operator);
    }
	 public static void Cal(int num1, int num2, String operator) {
	        int val = 0;
	        switch(operator) {
	            case "+":
	                val = num1 + num2;
	                break;
	            case "-":
	                val = num1 - num2;
	                break;
	            case "*":
	                val = num1 * num2;
	                break;
	            case "/":
	                val = num1 / num2;
	                break;
	            default:
	                System.out.println("Enter the correct operation..");
	        }
	        System.out.println(val);
	    }

}
