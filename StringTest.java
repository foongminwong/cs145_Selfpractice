package spring2012_exam1;

public class StringTest {
	public static void main(String[] args) {
		/*String c = "abc".substring(2, 3);
		System.out.println(c);//c
		String cde = "cde";
		System.out.println(cde.substring(1, 2));*/ // d
		
		String name = "wongfoongomin";
		System.out.println(name.charAt(4));
		System.out.println(name.substring(4, 9));
		String name2 = "wongfoongmik";
		System.out.println(name.compareTo(name2));
		System.out.println(name.indexOf("n"));
		System.out.println(name.indexOf("o", 7));
		System.out.println(name.lastIndexOf("o"));
		
				
	}
}
