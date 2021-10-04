import java.util.Scanner;
public class PowerOfNumber {
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int base = 2;
      int temp = base;
      System.out.println("Enter the exponent number N :");
      int exp = sc.nextInt();

      System.out.println("Result of "+base+" power "+exp+" is "+Math.pow(base, exp) );
   }
}
