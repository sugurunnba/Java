package pra;

public class lesson1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		1-1
		System.out.println("Hello World");
//		1-2
		int x = 11;
		System.out.println("x = " + x);
//		1-3
		x = 13;
		int y = 17;
		System.out.println("x = " + x + "," + "y = " + y);
//		1-4
		System.out.println("x + y = " + (x + y));
//		1-5
		System.out.println("x × y = " + x * y);
//		1-6
		x = 7;
		System.out.println("x × 3 = " + (x * 3));
		System.out.println("x ÷ 2 = " + (double)x / 2);
//		1-7
		x = 6;
		y = 5;
		int z = 0;

		z = x;
		x = y;
		y = z;
		System.out.println( "x=" + x + ",y=" + y );
//		1-8
		x = 19;
		y = 23;
		System.out.println("z = " + (x * y));
//		1-9
		x = 9;
		for(int i = 1; i <= 3; i++) {
			System.out.println("x =" + (i * x));
		}
//		1-10
		x = 5;
		for(int i = 1; i <= 3; i++) {
			System.out.println("xのi乗は" + Math.pow(x, i));
		}
//		1-11
		x = 21;
		y = 4;
		System.out.println("x ÷ y =" + (x / y) + "・・・" + (x % y));
//		1-12
		x = 2;
		x++;
		System.out.println("x =" + x);
		x = 2;
		x--;
		System.out.println("x =" + x);
	}

}
