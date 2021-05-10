package pra;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class lesson5 {

	public static void main(String[] args) throws IOException {
//		5-1
//		BufferedReader br = new BufferedReader(
//				new InputStreamReader(System.in));
//		System.out.println("10個の数値を入力ください。入力した数値を2倍にして表示していきます。");
//		for(int i = 1; i <= 10; i++) {
//			int x = Integer.parseInt(br.readLine());
//			System.out.println(x * 2);
//		}
//		System.out.println("プログラムを終了します");
//		↓
//		↓
//		↓模範解答
//		BufferedReader br = new BufferedReader(
//				new InputStreamReader(System.in));
//		int values[] = new int[10];
//		System.out.println("10個の数値を入力ください。入力した数値を2倍にして表示していきます。");
//		for(int i = 0; i < 10; i++) {
//			values[i] = Integer.parseInt(br.readLine());
//		}
//		System.out.println();
//		
//		for(int i = 0; i < 10; i++) {
//			System.out.println(values[i] * 2);
//		}
		
//		5-2
//		BufferedReader br = new BufferedReader(
//				new InputStreamReader(System.in));
//		int values[] = new int[10];
//		for(int i = 0; i < 10; i++) {
//			values[i] = Integer.parseInt(br.readLine());
//		}
//		for(int i = 9; i > -1; i--) {
//			System.out.println(values[i]);
//		}
		
//		5-3
//		BufferedReader br = new BufferedReader(
//				new InputStreamReader(System.in));
//		int values[] = new int[10];
//		
//		for(int i = 0; i < 10; i++) {
//			values[i] = Integer.parseInt(br.readLine());
//		}
//		System.out.print("\n偶数:");
//		for(int n: values)
//			if((n % 2) == 0)
//				System.out.print(n + " ");
//		System.out.print("\n奇数:");
//		for(int n : values)
//			if(n % 2 != 0)
//				System.out.print(n + " ");
		
//		5-4
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		int values[] = new int[10];
		int total = 0;
		int count = 0;
		for(count = 0; count < 10 && total <= 100; count++) {
			values[count] = Integer.parseInt(br.readLine());
			total += values[count];
		}
		
		for(int i = 0; i < 10; i++ ) {
			System.out.print("\n" + values[i]);
		}
//		
//		System.out.println("入力した数字は");
//		for(int n : values)
//			System.out.print(n + " ");
//		
//		System.out.print("\n合計は\n");
//		System.out.println(total + "です");
		
	}
}
//BufferedReader br = new BufferedReader(
//		new InputStreamReader(System.in));
//System.out.println();