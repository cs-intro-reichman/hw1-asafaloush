// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int lim = Integer.parseInt(args[0]);
		double a = (Math.random() * lim)+1;
		double b = (Math.random() * lim)+1;
		double c = (Math.random() * lim)+1;
		double max = Math.max(a, b);
		max = Math.max(max, c);
		double min = Math.min(a, b);
		min = Math.min(min, c);
		double mid = a+b+c-min-max;
		System.out.println((int)a + " " + (int)b + " " + (int)c);
		System.out.println((int)min + " " + (int)mid + " " + (int)max);
	}
}
