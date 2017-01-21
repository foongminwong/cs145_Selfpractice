package spring2012_exam1;

import java.util.Random;

public class Subfootines {
	public static void main(String[] args) {
		System.out.println(entag("body", "foo"));
		System.out.println(getRandomSequence(3));
	}

	public static String entag(String tag, String text) {
		tag = tag.toUpperCase();
		return "<" + tag + ">" + text + "</" + tag + ">";
	}
	
	public static String getRandomSequence(int n){
		Random rand = new Random();
		
		
		
		
	}
}
