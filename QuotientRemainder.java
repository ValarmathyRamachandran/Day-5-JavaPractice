public class QuotientRemainder{
	public static void main(String[] args) {
		//factors

		String commandLineInput1 = args[0];
		int num1 = Integer.parseInt(commandLineInput1);
		String commandLineInput2 = args[1];
		int num2 = Integer.parseInt(commandLineInput2);
		
		int quotient = 0, remainder = 0;  
  
      
    quotient = num1 / num2;  
  
    remainder = num1 % num2;  
  
    System.out.println("Quotient when " + num1 + "/" + num2 + " is: "   
  
+ quotient);  
    System.out.println("Remainder when " + num1 + " is divided by "   
  
+ num2 + " is: " + remainder);  
    }  
}   
		
