// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		int currentvalue = Integer.parseInt(args[0]);
        double rate = Double.parseDouble(args[1]);
        int years = Integer.parseInt(args[2]);
		int yearscounter = 0;
		double futurevalue = currentvalue;
		while (years>yearscounter) {
			futurevalue = futurevalue + (futurevalue * rate/100);
			yearscounter++;
		}
        System.out.println((int) futurevalue);
	}
}