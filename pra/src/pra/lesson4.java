package pra;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class lesson4 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
//		4-1
//		String x = "SPAM";
//		for(int i = 1; i <= 10; i++) {
//			System.out.println(i + "回目の" + x);
//		}

//		4-2
//		int x = 3;
//		for(int i = 1; i <= 9; i++) {
//			System.out.println(x + "×" + i + "=" + x * i );
//		}

//		4-3
//		int x = 2;
//		for(int i = 1; i <= 8; i++) {
//			System.out.println(x + "の" + i + "乗は" + Math.pow(x, i));
//		}

//		4-4(✔︎)
//		int x = 1;
//		for(int i = 2; i <= 7; i++) {
//			x *= i;
//		}
//		System.out.println(x);

//		4-5
//		BufferedReader br = new BufferedReader(
//				new InputStreamReader(System.in));
//		int total = 0;
//		for(int i = 1; i <= 10; i++) {
//			System.out.println(i + "回目の入力");
//			int x = Integer.parseInt(br.readLine());
//			System.out.println(x);
//			total += x;
//		}
//		System.out.println("平均値は" + (total / 10) + "(切り捨て)です");

//		4-6
//		BufferedReader br = new BufferedReader(
//				new InputStreamReader(System.in));
//		int total = 0;
//		for(int i = 1; i <= 10; i++) {
//			System.out.println(i + "回目の入力");
//			int x = Integer.parseInt(br.readLine());
//			total += x;
//		}
//		System.out.println("勝ちの総数は" + total + "回です");
//		System.out.println("負けの総数は" + (10 - total) + "回です");

//		4-7
//		BufferedReader br = new BufferedReader(
//				new InputStreamReader(System.in));
//		int K = 0;
//		int H = 0;
//		for(int i = 1; i <= 9; i++) {
//			System.out.println(i + "回表、巨人の得点は？");
//			int x = Integer.parseInt(br.readLine());
//			System.out.println(x + "点です");
//			System.out.println(i + "回表、阪神の得点は？");
//			int y = Integer.parseInt(br.readLine());
//			System.out.println(y + "点です");
//			K += x;
//			H += y;
//		}
//		System.out.println("巨人:" + K + "点, 阪神:" + H + "点");
//		if(K > H) {
//			System.out.println("巨人の勝ち");
//		} else {
//			System.out.println("阪神の勝ち");
//		}

//		4-8
//		BufferedReader br = new BufferedReader(
//				new InputStreamReader(System.in));
//		int maxInt = 0;
//		System.out.println("数字を10回入力ください");
//		for(int i = 1; i <= 10; i++) {
//			System.out.println("数字を入力ください(" + i + "回目");
//			int x = Integer.parseInt(br.readLine());
//			if (maxInt < x) {
//				maxInt = x;
//			}
//		}
//		System.out.println("入力した数値の最大値は" + maxInt + "です");

//		4-9
//		BufferedReader br = new BufferedReader(
//				new InputStreamReader(System.in));
//		int maxInt = 0;
//		int minInt = 0;
//		System.out.println("数字を10回入力ください");
//		for(int i = 1; i <= 10; i++) {
//			System.out.println("数字を入力ください(" + i + "回目");
//			int x = Integer.parseInt(br.readLine());
//			if (maxInt < x) {
//				maxInt = x;
//			} else if (minInt > x)  {
//				minInt = x;
//			}
//		}
//		System.out.println("入力した数値の最大値は" + maxInt + "です");
//		System.out.println("入力した数値の最小値は" + minInt + "です");
//		↓
//		↓
//		↓初期値を0にせずに最大値・最小値を表示させる書き方
//		BufferedReader br = new BufferedReader(
//                new InputStreamReader( System.in ) );
//		int maxInt = Integer.parseInt(br.readLine());
//		int minInt = maxInt;
//
//		for(int i = 1; i <= 10; i++) {
//			int value = Integer.parseInt(br.readLine());
//			if(value > maxInt) {
//				maxInt = value;
//			} else if(minInt > value) {
//				minInt = value;
//			}
//		}
//		System.out.println("入力した数値の最大値は" + maxInt + "です");
//		System.out.println("入力した数値の最小値は" + minInt + "です");

//		4-10
//		BufferedReader br = new BufferedReader(
//				new InputStreamReader(System.in));
//		System.out.println("数字を入力ください。入力した数分の「*」を表示します");
//		int x = Integer.parseInt(br.readLine());
//		for(int i = 1; i <= x; i++) {
//			System.out.println("*");
//		}

//		4-11
//		BufferedReader br = new BufferedReader(
//				new InputStreamReader(System.in));
//		System.out.println("数字を入力ください。入力した数分の0 ～ 9 の数字を表示(9の次は0)します");
//		int x = Integer.parseInt(br.readLine());
//		for(int i = 0, out = 0; i < x; i++) {
//			System.out.print(out++);
//			if(out > 9) {
//				out = 0;
//			}
//		}

//		4-12
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		System.out.println("数字を入力ください。入力した数字を足し合わせて、100を超えると入力を止めます");
		int totalInt = 0;
		for(int i = 1; totalInt <= 100; i++) {
			System.out.println(i + "回目の入力");
			int x = Integer.parseInt(br.readLine());
			totalInt += x;
			if(totalInt > 100) {
				System.out.println("合計が100を超えたので入力を終了します。合計は" + totalInt + "です");
			}
		}
	}
}
//System.out.println();
