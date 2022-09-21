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
			sieves[i] = i;
		}
		
		
		for (int i = 2; i < n ; i++)
		{
			
			for (int j = 2; j <= n; j++)
			{
				
				if (sieves[i] % j == 0  && sieves[i] != j)
				{
					sieves[i] = 0;
				}
				
			}
		}
		
		
		//Prints array
		for (int j = 1; j <= n-1; j++)
		{
			if (sieves[j] != 0)
			{
				System.out.print(sieves[j] + " ");
			}
			
			
		}
		
	}

}
