package spring2012_exam1;

import java.util.Random;

public class RandomTesting {
	public static void main(String[] args) {
		Random r = new Random();
		System.out.println(r.nextBoolean());
		System.out.println(r.nextInt(2));// exclude 2
		
		
	}
}
