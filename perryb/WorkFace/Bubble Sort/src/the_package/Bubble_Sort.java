package the_package;

import java.util.Random;

public class Bubble_Sort {

	static Random rnd = new Random();
	static int[] numba = new int[9];
	//static int i = 0;
	static int ok = 0;
	
	public static void main(String[] args) 
	{
		numba[0] = 0;
		for (int i = 1; i < numba.length; i++) 
		{	
			int transit = 0;
			ok++;
			numba[i] = rnd.nextInt(101);
			System.out.print(numba[i-1]+ " | =O ");
			if (ok >= 2 && numba[i-1] > numba[i]) {
				
				transit = numba[i-1];
				numba[i-1] = numba[i];
				numba[i] = transit;
			}
			else
				;
			ok++;
			
		}
	}

}
