package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// input array size
		Scanner in = new Scanner(System.in);
		System.out.println("Input a number: ");
		int n = in.nextInt();
		
		
		// checks if n is negative
		if (n < 0)
		{
			n *= -1;
		}
		
		
		// filling array
		int[] sieves = new int[n];
		for (int i = 0; i <= n - 1; i++)
		{
			sieves[i] = i + 1;
		}
		
		// checks if divisible by 2
		for (int j = 2; j <= n - 1; j++)
		{
			
			if (sieves[j] % 2 == 0)
			{
				sieves[j] = 0;
			}
			
		}
		
		// checks if divisible by 3
		for (int j = 3; j <= n - 1; j++)
		{
			
			if (sieves[j] % 3 == 0)
			{
				sieves[j] = 0;
			}
			
		}
		
		// checks if divisible by 5
		for (int j = 5; j <= n - 1; j++)
		{
			
			if (sieves[j] % 5 == 0)
			{
				sieves[j] = 0;
			}
			
		}
		
		// checks if divisible by 7
		for (int j = 7; j <= n - 1; j++)
		{
			
			if (sieves[j] % 7 == 0)
			{
				sieves[j] = 0;
			}
			
		}
		
		
		
		// Prints array
		for (int j = 1; j <= n-1; j++)
		{
			if (sieves[j] != 0)
			{
				System.out.print(sieves[j] + " ");
			}
			
			
		}
		
	}

}
