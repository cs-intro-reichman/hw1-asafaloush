// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	    int n = Integer.parseInt(args[0]);
		int ones=(n%10);
		int tens= (n/10)%10;
		int hundreds = (n/100)%10;
		System.out.println(hundreds + " hundreds, " + tens + " tens, " + ones + " ones.");
	}
}
