package midtermprac;

import java.util.Random;

public class Fall2016_05 {
	public static void main(String[] args) {
		
		
		System.out.println(randInt(0,100));
		System.out.println(randInt(0,100));
		System.out.println(randInt(0,100));
		System.out.println(randInt(0,100));
		System.out.println(randInt(0,100));
		System.out.println(randInt(0,100));
		System.out.println(randInt(0,100));
		System.out.println(randInt(0,100));
		System.out.println(randInt(0,100));
		System.out.println(randInt(0,100));
		System.out.println(randInt(0,100));
		System.out.println(randInt(0,100));
		System.out.println(randInt(0,100));
	
	}
	
	
	public static int randInt(int min,int max){
		Random rand = new Random();
		
		int randomNum = rand.nextInt((max-min)+1 + min);
		
		return randomNum;
	}
}
