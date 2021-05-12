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
	public static void main(String[] args) {
		calc(3);
		System.out.println("");
		calc(4);
		System.out.println("");
		calc(5);
		System.out.println("");
	}
	static void calc(int x) {
		for(int i = 0; i < x; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("$");
			}
			System.out.println("");
		}
	}
	
	
	
	
}
//public static void main(String[] args) {
//	
//}
//System.out.println("");