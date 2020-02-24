import java.util.Scanner;

/**
 * 
 * @author Aaliyah
 *
 */
public class Homework1 {
	public static void main(String[]args) {
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter number of Eastern Caribbean Dollars :");
		double cd =kb.nextDouble();
		System.out.println("Enter number of Dominican Pesos :");
		double dop =kb.nextDouble();
		System.out.println("Enter number of Brazillian Reals :");
		double br =kb.nextDouble();
		
		double totalAmountUS = cd*.37 + dop*.019 + br*.239;
		
		System.out.println("US Dollars = $"+totalAmountUS);
		
		
		
	}

}
