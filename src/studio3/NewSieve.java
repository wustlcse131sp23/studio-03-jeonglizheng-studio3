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
		
		int position = 1;
		int prime = 2;
		while (position < range/2)
		{
			for (int multiple = prime * 2 - 1; multiple < range; multiple += prime)
			{
				numbers[multiple] = 0;

			}
			int move = 1;
			while ((position + move) < range && numbers[position + move] == 0)
			{
				move++;
			}
			position += move;
			prime = position + 1;
		}
		
		
		for (int number : numbers)
		{
			if (number != 0 && number != 1)
			System.out.println(number + " ");
		}
		
	}

}
