import java.util.Scanner;
/**
 * 
 * @author Aaliyah
 *
 */
public class Sum {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int i = 0;
		int sum = 0;
		
		while(i<11) {
			sum += i;
			i++;
		}
		System.out.println("The sum is " + sum);
	}

}
