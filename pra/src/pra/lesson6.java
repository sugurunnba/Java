package pra;

public class lesson6 {
//	public static void main(String[] args) {
//	6-1
//		System.out.println("3の2乗=" + pow2(3));
//	}
//	static int pow2(int n) {
//		return n * n;
//	}
	
//	6-2
//	public static void main(String[] args) {
//		System.out.println("4と2の平均は" + calc(4, 2));
//	}
//	static int calc(int x, int y) {
//		return (x + y) / 2;
//	}
	
//	6-3
//	public static void main(String[] args) throws IOException {
//		System.out.println("3回、数字を入力ください。最も大きい数字を表示します。");
//		BufferedReader br = new BufferedReader(
//				new InputStreamReader(System.in));
//		int x = Integer.parseInt(br.readLine());
//		int y = Integer.parseInt(br.readLine());
//		int z = Integer.parseInt(br.readLine());
//		System.out.println(calc(x, calc(y, z)));
//	}
//	static int calc(int x, int y) {
//		if(x > y) {
//			return x;
//		} else {
//			return y;
//		}
//	}
	
//	6-4
//	public static void main(String[] args) {
//		calc(3);
//		System.out.println("");
//		calc(4);
//		System.out.println("");
//		calc(5);
//		System.out.println("");
//	}
//	static void calc(int x) {
//		for(int i = 0; i < x; i++) {
//			for(int j = 0; j <= i; j++) {
//				System.out.print("$");
//			}
//			System.out.println("");
//		}
//	}
	
//	6-5
//	public static void main(String[] args) {
//		calc(3, '%');
//		System.out.println("");
//		calc(5, '#');
//		System.out.println("");
//		calc(7, '@');
//	}
////	Stringは複数の文字、charは一文字のみを表示することができる
//	static void calc(int size, char ch) {
//		for(int i = 0; i < size; i++) {
//			for(int j = 0; j < i; j++) {
//				System.out.print(ch);
//			}
//		System.out.println();
//		}
//	}
	
//	6-6
//	public static void main(String[] args) {
//		for(int i = 1; i <= 9; i++) {
//			calc(i);
//		}
//	}
//	
//	static void calc(int x) {
//		System.out.print(x + "の段 : ");
//		for(int i = 1; i <= 9; i ++) {
//			System.out.print((x * i) + " ");
//		}
//		System.out.println("");
//	}
	
//	6-7
//	???
//	public static void main( String[] args )
//	{
//	    for( int n = 10000 ; n < 10100 ; n++ )
//	        if( IsPrimeNumber( n ) )
//	            System.out.print( n + " " );
//	}
//
//	static boolean IsPrimeNumber( int num )
//	{
//	    if( num <= 3 )
//	        return true;
//
//	    for( int i = 2 ; i <= ( num / 2 ) ; i++ )
//	        if( ( num % i) == 0 )
//	            return false;
//
//	    return true;
//	}
	
//	6-8
//	1番目から引数までの数列を表示するプログラム
//	public static void main(String[] args) {
//		calc(20);
//	}
//	static void calc(int x) {
//		int a = 0;
//		int b = 1;
//		System.out.println("1番目 " + a);
//		for(int i = 2, total = 1; i <= x; i++) {
//			System.out.println(i + "番目 " + total);
//			total = a + b;
//			a = b;
//			b = total;
//		}
//	}
//	↓
//	↓
//	↓模範解答(考えた人すごい…)
//	public static void main(String[] args) {
//		for(int n = 11; n <= 20; n++) {
//			System.out.println(Fibonacci(n) + " ");
//		}
//	}
//	static int Fibonacci(int n) {
//		if(n == 0) {
//			return 0;
//		} else if(n == 1) {
//			return 1;
//		} else {
//			return Fibonacci(n - 2) + Fibonacci(n - 1);
//		}
//	}
	
	
}
//public static void main(String[] args) {
//	
//}
//System.out.println("");