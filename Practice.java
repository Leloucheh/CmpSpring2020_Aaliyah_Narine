package onlineClass1;

public class Practice {
	  public static void main(String[] args) {
		  
		  System.out.print("Hello, this is a program that performs arithmetic operations");
		  
		  int result = sumTwo(7, 8);
		  System.out.print(result);
		  
		  Practice p1 = new Practice();
		  int result2 = p1.product3(2,2,2);
		  System.out.println(result2);
	  }


	public static int sumTwo(int num1, int num2) {
		return num1 + num2;
	}
	
	public int product3(int num1, int num2, int num3)
	{
		return num1 * num2 * num3;
		
	}
}

