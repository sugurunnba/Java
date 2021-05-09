package pra;

import java.io.IOException;

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
//		BufferedReader br = new BufferedReader(
//				new InputStreamReader(System.in));
//		System.out.println("数字を入力ください。入力した数字を足し合わせて、100を超えると入力を止めます");
//		int totalInt = 0;
//		for(int i = 1; totalInt <= 100; i++) {
//			System.out.println(i + "回目の入力");
//			int x = Integer.parseInt(br.readLine());
//			totalInt += x;
//			if(totalInt > 100) {
//				System.out.println("合計が100を超えたので入力を終了します。合計は" + totalInt + "です");
//			}
//		}

//		4-13
//		BufferedReader br = new BufferedReader(
//				new InputStreamReader(System.in));
//		int strike = 0;
//		int ball = 0;
//		while(strike < 3 && ball < 4) {
//			System.out.println("ストライクかボールを入力ください(ストライク=1 or ボール=2)");
//			int judge = Integer.parseInt(br.readLine());
//			if(judge == 1) {
//				strike++;
//			} else if(judge == 2) {
//				ball++;
//			}
//		}
//		System.out.println(ball + "ボール," + strike + "ストライク");

//		4-14
//		BufferedReader br = new BufferedReader(
//				new InputStreamReader(System.in));
//		int strike = 0;
//		int ball = 0;
//		while(strike < 3 && ball < 4) {
//			System.out.println("ストライクかボールかファウルを入力ください(ストライク=1 or ボール=2 or ファウル=3)");
//			int x = Integer.parseInt(br.readLine());
//			if(x == 1) {
//				strike++;
//			} else if(x == 2) {
//				ball++;
//			} else if(x == 3) {
//				if(strike <= 1) {
//					strike++;
//				}
//			}
//		}
//		System.out.println(ball + "ボール," + strike + "ストライク");

//		4-15
//		BufferedReader br = new BufferedReader(
//				new InputStreamReader(System.in));
//		System.out.println("数字を入力ください。素数であるかを判定します。");
//		int x = Integer.parseInt(br.readLine());
//		if((x % 2 == 0) || (x % 3 == 0) || (x % 5 == 0) || (x % 7 == 0)) {
//			System.out.println(x + "は素数ではない");
//		} else {
//			System.out.println(x + "は素数です");
//		}

//		4-16

//		4-17
//		for(int x = 1; x <= 9; x++) {
//			for(int y = 1; y <= 9; y++) {
//				System.out.printf("%2d", x * y);
//			}
//			System.out.println();
//		}

//		4-18
//		BufferedReader br = new BufferedReader(
//				new InputStreamReader(System.in));
//		int total = 0;
//		System.out.println("数字を入力ください。0を入力すると、それまでに入力した数字の合計を表示します。");
//		for(;;) {
//			int x = Integer.parseInt(br.readLine());
//			if(x == 0) {
//				break;
//			}
//			total += x;
//		}
//		System.out.println("合計は" + total + "です。");

//		4-19
//		BufferedReader br = new BufferedReader(
//				new InputStreamReader(System.in));
//		System.out.println("数字を入力ください。0を入力すると、それまでに入力した数字の平均値(切り捨て)を表示します。");
//		int total = 0;
//		int average = 0;
//		int count = 0;
//		for(;;) {
//			int x = Integer.parseInt(br.readLine());
//			if(x == 0) {
//				break;
//			}
//			count++;
//			total += x;
//		}
//		average = total / count;
//		System.out.println("平均値は" + (double)average + "です。");

//		4-20
//		BufferedReader br = new BufferedReader(
//				new InputStreamReader(System.in));
//		int x = Integer.parseInt(br.readLine());
//		for(int i = 0; i < x; i++) {
//			for(int j = 0; j <= i; j++) {
//				System.out.print("$");
//			}
//			System.out.println();
//		}

//		4-21
//		?
//		BufferedReader br = new BufferedReader(
//                        new InputStreamReader( System.in ) );
//		int size = Integer.parseInt( br.readLine() );
//
//		for( int i = 0 ; i < size ; i++ )
//		{
//		    for( int j = 0 ; j < size ; j++ )
//		    {
//		        if( i == j || ( size - i - 1 ) == j )
//		            System.out.print( "X" );
//		        else
//		            System.out.print( " " );
//		    }
//
//		    System.out.println( "" );
//		}

//		4-22
//		BufferedReader br = new BufferedReader(
//				new InputStreamReader( System.in ) );
//		int x = 0;
//		int y = 1;
//		int total = 0;
//
//		System.out.println(x);
//		System.out.println(y);
//		while(total < 1000) {
//			System.out.println(total);
//			total = x + y;
//			x = y;
//			y = total;
//		}
//		↓
//		↓
//		↓模範解答
		int x = 0;
		int y = 1;
		int z = x + y;
		while(x <= 1000) {
			System.out.println(x + ",");
			x = y;
			y = z;
			z = x + y;
		}





	}
}
//System.out.println();
