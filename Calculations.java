/**
 * 
 * @author Aaliyah Narine
 *
 */
public class Calculations {
     /* method: sum1toN
      * parameters: int N
      * output: sum from 1 to N
      */
	public static int sum1toN (int N) {
		int total = 0;
		for ( int i = 1; i <= N; i++ )
			total += i;
		return total;
	}
 

    /*
     * method: QuadraticFormula
     * parameters:a, b, c
     * returns: double []
     */
    public static double[] QuadraticFormula (double a, double b, double c) {
    	double [] roots = new double[2];
    	double result = b*b - 4*a*c;
    	result = Math.sqrt(result)/2.0*a;
    	roots [0] = -b + result;
    	roots [1] = -b - result;
    	return roots;
    }
    
   /*
    * method: weatherAlert
    * parameter: temperature
    * returns: String
    */
    public static String weatherAlert (int temperature) {
    	if (temperature > 70)
    		return "hot";
    	else if (temperature > 50)
    		return "warm";
    	else if (temperature > 35)
    		return "cool";
    	return "cold";
    	
    }
    public static void main(String[] args) {
    	System.out.println(sum1toN(5));
    	System.out.println(QuadraticFormula(1, 5, 3)[0]);
    	System.out.println(weatherAlert(30));
    }
    }