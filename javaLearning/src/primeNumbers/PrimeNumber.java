package primeNumbers;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = scanner.nextInt(); // Prime Numbers: 1, 2, 3, 5, 7, 11, 13, 17, 19, 23....
		boolean isPrime = false;
		for(int i = 2; i < num; i++) {
			if(num % i == 0) {
				isPrime = true;
				break;
			}
		}
		if(isPrime) {
			System.out.println("Given Number is not a Prime Number");
		}
		else {
			System.out.println("Given Number is a Prime Number");
		}
		scanner.close();
	}
}
