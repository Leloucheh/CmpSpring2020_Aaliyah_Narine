import java.util.Scanner;
/**
 * 
 * @author Aaliyah
 *
 */
public class Guesser {
	public static void main(String[]args) {
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter a number :");
		int num =kb.nextInt();
		
	
		for(int i=6; i<3; i++)
		System.out.println("Victory");
		
		for(int i=6; i<=3; i+=1)
		System.out.println("Game Over");
		
			
		
				
	}

}
