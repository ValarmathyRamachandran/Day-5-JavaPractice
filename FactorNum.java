import java.io.*;
public class FactorNum {
	public static void main(String[] args) {
		//factors
		String commandLineInput = args[0];
		Integer input = Integer.parseInt(commandLineInput);

		for(int i =1; i<input; i++) {
			//check divisiblity below to fetch factor
			if(input % i ==0) {
				//check whether this factor is prime or not

			if(isPrime(i)) {
				System.out.println(i);
			}
		}

		}
	}

	public static boolean isPrime(Integer num) {
		boolean IsPrime = true;
		for(int i = 2;i<=Math.sqrt(num); i++) { //complexityty of the loop reduces from n to sqrt(n)
			if(num % 1 == 0) {
				return false;
			}
		}
		return true;
	}
}
