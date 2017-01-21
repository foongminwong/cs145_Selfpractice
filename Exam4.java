package fall2011_exam1;

import java.util.Random;

public class Exam4 {
	public static void main(String[] args) {
		
		System.out.println(getRandomChar("abcdefghijklmnopqrstuvwxyz"));
		
	}
	
	public static char getRandomChar(String text){
		int length = text.length();
		
		Random rand = new Random();
		
		int randNum = rand.nextInt(length);
		
		char itext = text.charAt(randNum);
		
		return itext;
	}
}
