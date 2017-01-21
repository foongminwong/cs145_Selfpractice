package midtermprac;

public class Fall2011_01 {
	public static void main(String[] args) {
		String numbers = "123456789";
		int unlucky = 13;
		double cents = 25.0;
		System.out.println(numbers.charAt(1));
		System.out.println(numbers.length());
		System.out.println(((double) numbers.length() + 1) / 4);
		System.out.println(unlucky / 2);
		System.out.println(unlucky % 10);
		System.out.println(cents * 2);
		System.out.println(cents / 2);
		System.out.println((cents - unlucky) / 2);
		System.out.println("(int) 13.9");
	}
}
