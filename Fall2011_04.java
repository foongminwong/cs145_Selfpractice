package midtermprac;

public class Fall2011_04 {
	public static void main(String[] args) {
		String name = "abcdefg";
		System.out.println(reverse(name));
	}
	
	//my method void
	/*public static void reverse(String name){
		int length = name.length();
		
		for(int i = length-1; i >=0; i--){
			System.out.print(name.charAt(i));
		}
	}*/
	
	//other method not void
	public static String reverse(String str){
		String reverse = "";
		int length = str.length();
		for(int i = length - 1; i >= 0; i--){
			reverse = reverse + str.charAt(i);
		}
		return reverse;
	}
}
