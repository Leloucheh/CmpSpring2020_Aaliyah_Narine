import java.util.Scanner;
/**
 * 
 * @author Aaliyah
 *
 */
public class Guesser {
	public static void main(String[]args) {
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Welcome to the Guessing Game! In this game you are going to be guessing numbers to win! ");
		
		System.out.println("Please enter a number :");
		int num = kb.nextInt();
		
		if (num = 6) {
		for(int i=0; i<3; i++)
		System.out.println("Victory");
		}
		else {
		for(int i=0; i<=3; i++)
		System.out.println("Game Over");
		}
	}
}

