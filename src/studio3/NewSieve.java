package studio3;

import java.util.Scanner;

public class NewSieve {

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
		
		int prime = 2;
		
		for (int i = 0; i < range; i++)
		{
			for (int position = 3; position < range; position += prime)
			{
				numbers[position] = 0;

			}
		}
		
		
		for (int number : numbers)
		{
			
			System.out.print(number + " ");
		}
		
	}

}
