import java.util.Scanner;
import java.util.Random;


public class RUN {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
		Random generator = new Random();
		String names[] = new String[5];
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
	
	
	
	
	
	
	
	
		for (int index = 0; index < names.length; index++){
			
			
			
			
			System.out.println("Enter Name " + (index + 1) + "! ");
			names[index] = input.next();
		}
	
	 System.out.println("The Winner Is " + names[generator.nextInt(11)] + "!");
	
	}
	
	
}