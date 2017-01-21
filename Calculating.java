package spring2012_exam1;

import java.util.Scanner;

public class Calculating {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double total = 0;
		int count = 1;
		while(count <=10){
			System.out.print("Radius? ");
			double radius = in.nextDouble();
			double volume = 4.0/3.0 * Math.PI * Math.pow(radius, 3);
			// double 4.0/3.0 is not 4/3 << int
			System.out.println(volume);
			total = total + volume; // this!
			count++;
		}
		System.out.println(total);
	}
}
