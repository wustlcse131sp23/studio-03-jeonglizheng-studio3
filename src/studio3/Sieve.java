package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter the biggest number n: ");
		int range = in.nextInt();
		int[] numbers = new int [range];
		int[] index = new int [range];
		
		for (int i = 0; i < range; i++)
		{
			numbers[i] = i + 1;
		}
		
		int increment = 1;
		
		for (int count = 0; count + increment <range; count++)
		{
			if (index[0 + increment] == 0)
			{
				for (int p = 1; numbers[0 + increment] * p <= range; p++)
				{
					for (int i = 1 + increment; i < range; i++)
					{
						if (index[i] == 0)
						{
							if (numbers[i] == numbers[0 + increment] * p)
							{
								index[i] = i;
							}
						}
					}
				}
			}
			increment++;
		}
		
		
		for (int primeIndex = 1; primeIndex < range; primeIndex++)
		{
			if (index[primeIndex] == 0)
			{
				System.out.print(numbers[primeIndex] + " ");
			}
			
		}

	}

}
