package arrays_textbook;

public class Reverse {
	public static void main(String[] args) {
		String s = "Mississipi";
		
		String result = "";
		
		for(int i = 0; i < s.length(); i++){
			result = s.charAt(i) + result;
			System.out.println(result);
		}
		
		//System.out.println(result);
	}
}
