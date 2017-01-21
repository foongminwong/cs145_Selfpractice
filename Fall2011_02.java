package midtermprac;

public class Fall2011_02 {
	public static void main(String[] args) {
		double d1 = 5.0;
		double d2 = 4.0;
		int i1 = 10;
		int i2 = 10;
		int i3 = 3;
		char c1 = '1';
		String s = "abcd123";
		
		System.out.println(d2 < d1);
		System.out.println(d1 == d2);
		System.out.println(((double) s.length()) / 2);
		System.out.println(s.substring(0, 3) + s.charAt(3));
		System.out.println(i2 / i3 * i3);
		System.out.println(i1 >= i2 && i2 >= i3);
		System.out.println("34" + i2 + c1);
		System.out.println(i2 + 200 + "34");
		System.out.println(s.substring(4).length() != 0);
		System.out.println(d1 - i2 / i3);
		
	}
}
