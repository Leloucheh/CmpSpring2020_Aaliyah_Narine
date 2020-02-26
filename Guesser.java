import java.util.Scanner;
import java.util.Random;
/**
 * 
 * @author Aaliyah
 *
 */
public class Guesser {
	public static void main(String[]args) {
		Scanner kb = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.println("Welcome to the Guessing Game! In this game you are going to be guessing numbers to win! ");
		
		int randPick = rand.nextInt(3);
		
		System.out.println("Please enter a number from 0 to 2: ");
		int userPick= kb.nextInt();
		
		if (userPick == randPick) {
		for(int i=0; i<3; i++)
		System.out.println("Victory");
		}
		else {
		for(int i=0; i<3; i++)
		System.out.println("Game Over");
		}
	}
}
