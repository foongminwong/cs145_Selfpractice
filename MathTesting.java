package spring2012_exam1;

public class MathTesting {
	public static void main(String[] args) {
		
		// 49.0 for ALL
		/*System.out.println(Math.floor(49.0));
		System.out.println(Math.floor(49.1));
		System.out.println(Math.floor(49.2));
		System.out.println(Math.floor(49.3));
		System.out.println(Math.floor(49.44));
		System.out.println(Math.floor(49.5)); 
		System.out.println(Math.floor(49.6));
		System.out.println(Math.floor(49.7));
		System.out.println(Math.floor(49.9));*/
		
		System.out.println(Math.floor(-0.789)); // -1
		System.out.println(Math.max(5.5,99.9));
		System.out.println(Math.random());// generate [0.0 - 1.0)
		System.out.println(Math.round(-1.59));
		System.out.println(Integer.compare(6, 3));// only integer
		System.out.println(Integer.toString(56));
		System.out.println(String.format("%02x", 55));
		//System.out.println(Integer.parseInt("55"));
		
	}
}
