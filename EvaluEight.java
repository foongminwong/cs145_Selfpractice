package spring2012_exam1;

public class EvaluEight {
	public static void main(String[] args) {
		double max = Math.max(14.2,90.11);
		int maxx = Math.max(8, 4);
		System.out.println(max);
		System.out.println(maxx);
		
		// which one has higher precedence
		// data types list and order
		
		System.out.println(1 + Math.pow(2.0, 3));//9.0, double
		System.out.println(7 >= 14/2);// false,int, boolean
		System.out.println("$" + 3 * 0.5);
		System.out.println(15%12 + "PM");
		System.out.println((3.5 + 1) * 2 - 1);
	}
}
