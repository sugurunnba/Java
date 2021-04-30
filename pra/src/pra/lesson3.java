package pra;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class lesson3 {
	public static void main(String[] args) throws IOException {
//		3-1
//		BufferedReader br = new BufferedReader (
//			new InputStreamReader(System.in));
//		System.out.println("xに入る数字を入力ください。");
//		int x = Integer.parseInt(br.readLine());
//		System.out.println("yに入る数字を入力ください。");
//		int y = Integer.parseInt(br.readLine());
//
//		if (x > y) {
//			System.out.println("xはyより大きい。");
//		}

//		3-2
//		BufferedReader br = new BufferedReader (
//				new InputStreamReader(System.in));
//		System.out.println("xに入る数字を入力ください");
//		int x = Integer.parseInt(br.readLine());
//		System.out.println("yに入る数字を入力ください");
//		int y = Integer.parseInt(br.readLine());
//		if(x > y) {
//			System.out.println("大きい数字は" + x + "です");
//		}else {
//			System.out.println("大きい数字は" + y + "です");
//		}

//		3-3
//		BufferedReader br = new BufferedReader (
//				new InputStreamReader(System.in));
//		System.out.println("xに入る数字を入力ください");
//		int x = Integer.parseInt(br.readLine());
//		System.out.println("yに入る数字を入力ください");
//		int y = Integer.parseInt(br.readLine());
//		if (x > y) {
//			System.out.println("xはyより大きい");
//		} else {
//			System.out.println("xはyより小さい");
//		}

//		3-4
//		BufferedReader br = new BufferedReader (
//				new InputStreamReader(System.in));
//		System.out.println("xに入る数字を入力ください");
//		int x = Integer.parseInt(br.readLine());
//		System.out.println("yに入る数字を入力ください");
//		int y = Integer.parseInt(br.readLine());
//		if (x > y) {
//			System.out.println("xはyより大きい");
//		} else if(x == y) {
//			System.out.println("xはyと等しい");
//		} else {
//			System.out.println("xはyより小さい");
//		}

//		3-5
//		BufferedReader br = new BufferedReader(
//				new InputStreamReader(System.in));
//		System.out.println("xに入る数字を入力ください");
//		int x = Integer.parseInt(br.readLine());
//		if (x % 2 == 0) {
//			System.out.println("xは偶数です。");
//		} else {
//			System.out.println("xは奇数です。");
//		}

//		3-6
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		System.out.println("xに入る数字を入力ください");
		int x = Integer.parseInt(br.readLine());
		if ((x % 2 == 0) && (x >= 0)) {
			System.out.println("xは正の偶数です");
		} else if((x % 2 == 1) && (x >= 0)) {
			System.out.println("xは正の奇数です");
		} else if((x % 2 == 0) && (x < 0)) {
			System.out.println("xは負の偶数です");
		} else {
			System.out.println("xは負の奇数です");
		}
	}
}
