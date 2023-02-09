package studio3;

import java.util.Scanner;

public class SieveExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter the biggest number n: ");
		int n = in.nextInt();
		boolean[] primes = new boolean[n + 1];
		
		for (int i = 1; i < primes.length; i++)
		{
			primes[i] = true;
		}
		
		for (int factor = 2; factor < primes.length / 2; factor++)
		{
			for (int multiple = factor * 2; multiple < primes.length; multiple += factor)
			{
				primes[multiple] = false;
			}
		}
		
		for (int i = 0; i < primes.length; i++)
		{
			if (primes[i])
			{
				System.out.println(i + " is prime");
			}
		}
	}

}
