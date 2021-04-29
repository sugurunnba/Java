package pra;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class lesson2 {

	public static void main(String[] args) throws IOException {
//		2-2
//		BufferedReader br = new BufferedReader(
//				new InputStreamReader(System.in));
//		String s = br.readLine();
//		int n = Integer.parseInt(s);
//		System.out.println(s);
//		↓
//		BufferedReader br = new BufferedReader(
//				new InputStreamReader(System.in));
//		int n = Integer.parseInt(br.readLine());


//		2-3
//		BufferedReader br = new BufferedReader(
//				new InputStreamReader(System.in));
//		String s = br.readLine();
//		int n = Integer.parseInt(s);
//
//		for(int i = 1; i <= 3; i++) {
//			System.out.println(n + "の" + i + "乗" + Math.pow(n, i) + "です");
//		}

//		2-4
//		BufferedReader br = new BufferedReader(
//				new InputStreamReader(System.in));
//		System.out.println("xに入る数字を入力ください");
//		int x = Integer.parseInt(br.readLine());
//		System.out.println("yに入る数字を入力ください");
//		int y = Integer.parseInt(br.readLine());
//
//		System.out.println("x + y = " + (x + y));
//		System.out.println("x - y = " + (x - y));
//		System.out.println("x × y = " + (x * y));
//		System.out.println("x ÷ y = " + (double)x / y);
//		System.out.println("x ÷ y = " + (x % y));

//		2-5
//		BufferedReader br = new BufferedReader(
//				new InputStreamReader(System.in));
//		System.out.println("xに入る数字を入力ください");
//		int x = Integer.parseInt(br.readLine());
//		System.out.println("yに入る数字を入力ください");
//		int y = Integer.parseInt(br.readLine());
//		System.out.println("xとyの平均値は" + (double)((x + y) / 2) + "です");

//		2-6
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		System.out.println("あなたの年齢は?");
		int x = Integer.parseInt(br.readLine());
		System.out.println("あなたが生まれてから今までの日数は、最低でも" + (x * 365) + "日が経過しています");
	}

}
