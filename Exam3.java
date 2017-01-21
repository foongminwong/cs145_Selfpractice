package fall2011_exam1;

import java.util.Scanner;

public class Exam3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		for (int i = 1; i <= num; i++) {
			System.out.println((int)(Math.pow(i, 2)));
		}
	}
}
