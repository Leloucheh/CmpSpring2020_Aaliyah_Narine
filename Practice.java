package onlineClass1;

public class Practice {
	  public static void main(String[] args) {
		  
		  System.out.print("Hello, this is a program that performs arithmetic operations");
		  
		  int result = sumTwo(7, 8); //expected 15
		  System.out.print(result);
		  
		  Practice p1 = new Practice();
		  int result2 = p1.product3(2,2,2); //expected 8
		  System.out.println(result2);
		  
		  System.out.println("Arrays Part 1");
		  
		  //Arrays
		  int [] ages = {17, 54, 23, 19, 20};
		  
		  for (int i=0; i < ages.length; i++)
			  System.out.println(ages[i]);
		  
		  double [] balances = new double [100]; //0.0
		  for(double bal: balances)
		      System.out.println(bal);
			  
		  String [] names = new String[10]; //null
		  
		  /*
		   * type [] identifier = new type [size]
		   */
	  }

	public static int sumTwo(int num1, int num2) {
		return num1 + num2;
	}
	
	public int product3(int num1, int num2, int num3)
	{
		return num1 * num2 * num3;
		
	}
}

