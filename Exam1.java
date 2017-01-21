package fall2011_exam1;

import java.util.Random;
import java.util.Scanner;

public class Exam1 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println(isLong("zazabobop"));
		System.out.println(getNumber(in));
		System.out.println(tax(5,5));
		System.out.println(getGenerator());
	}
	
	public static boolean isLong(String text){
		return text.length() > 10;
	}
	
	public static int getNumber(Scanner in){
		return in.nextInt();
	}
	
	public static double tax(int price, double taxRate){
		return price * taxRate;
	}
	
	public static Random getGenerator(){
		return new Random();
	}
}
