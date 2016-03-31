/**
 * 
 */
package rasic;

/**
 * https://github.com/benjaminrasic/Lukas13
 * Rekursiv Lukas zahlen
 * Array für Fibonaci
 * @author Rasic Benjamin
 * @version 1.0
 */
public class FiboLuka {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	/**
	 * Gibt Rekursiv Lucaszahlen zurück
	 * @param n
	 * @return
	 */
	public static long lucas(long n) {
		try{
	    if(n==0) 
	    	return 2;
	    if(n==1) 
	    	return 1;
	    return lucas(n+2) - lucas(n+1);
		}catch(StackOverflowError e){
			System.out.println("Overflow: ) ");
			return n;
		}catch(ArithmeticException e){
			System.out.println("Unpassende Zahl");
			return n;
		}
	}
	
	/**
	 * Speichert Fibonacci Zahlen in array
	 * @param n
	 * @return 
	 */
	public long fibonacci(long n){
		try{
		if(n<=2)
			return 1;
		long[] fibo = new long[(int)n];
        for (int i = 0; i < n; i++) {
        	int f0 = 0;
        	int f1 = 1;
            int f2 = f0 + f1;
            fibo[i] = f2;
            f0 = f1;
            f1 = f2;
        }
        return fibo[(int)n];
		}catch(StackOverflowError e){
			System.out.println("Overflow :) ");
			return n;
		}catch(ArithmeticException e){
			System.out.println("Unpassende Zahl");
			return n;
		}
	}

}
