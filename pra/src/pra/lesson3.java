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
//		BufferedReader br = new BufferedReader(
//				new InputStreamReader(System.in));
//		System.out.println("xに入る数字を入力ください");
//		int x = Integer.parseInt(br.readLine());
//		if ((x % 2 == 0) && (x >= 0)) {
//			System.out.println("xは正の偶数です");
//		} else if((x % 2 == 1) && (x >= 0)) {
//			System.out.println("xは正の奇数です");
//		} else if((x % 2 == 0) && (x < 0)) {
//			System.out.println("xは負の偶数です");
//		} else {
//			System.out.println("xは負の奇数です");
//		}

//		3-7
//		BufferedReader br = new BufferedReader(
//				new InputStreamReader(System.in));
//		System.out.println("試験の結果を入力ください");
//		int x = Integer.parseInt(br.readLine());
//		if(x >= 60) {
//			System.out.println("合格");
//		} else {
//			System.out.println("不合格");
//		}
//
//
//		int y = Integer.parseInt(br.readLine());
//		if (y >= 80) {
//			System.out.println("たいへんよくできました");
//		} else if((y >= 60) && (y < 80)) {
//			System.out.println("よくできました");
//		} else {
//			System.out.println("ざんねんでした");
//		}
//
//
//		int z = Integer.parseInt(br.readLine());
//		if (z >= 80) {
//			System.out.println("優");
//		} else if((z >= 70) && (z < 80)) {
//			System.out.println("良");
//		} else if((z >= 60) && (z < 70)) {
//			System.out.println("可");
//		} else {
//			System.out.println("不可");
//		}


//		3-8
//		BufferedReader br = new BufferedReader(
//				new InputStreamReader(System.in));
//		System.out.println("中間試験の結果を入力ください");
//		int x = Integer.parseInt(br.readLine());
//		System.out.println(x + "点");
//		System.out.println("期末試験の結果を入力ください");
//		int y = Integer.parseInt(br.readLine());
//		System.out.println( y+ "点");
//		if ((x >= 60) && (y >= 60) ) {
//			System.out.println("合格");
//		} else if((x + y) >= 130) {
//			System.out.println("合格");
//		} else if((x + y >= 100) && ((x >= 90) || (y >= 90))) {
//			System.out.println("合格");
//		} else {
//			System.out.println("不合格");
//		}


//		3-9
//		BufferedReader br = new BufferedReader(
//				new InputStreamReader(System.in));
//		System.out.println("日曜日は0, 月曜日は1, 火曜日は2, 水曜日は3, 木曜日は4, 金曜日は5, 土曜日は6、と該当する曜日を数字で入力ください");
//		int x = Integer.parseInt(br.readLine());
//		System.out.println(x);
//		System.out.println("午前は0, 午後は1, 夜間は2、と該当する時間帯を数字で入力ください");
//		int y = Integer.parseInt(br.readLine());
//		System.out.println(y);
//		if((x == 1) && (y >= 0)) {
//			System.out.println("病院は空いています");
//		} else if((x == 2) && (y >= 1)) {
//			System.out.println("病院は空いています");
//		} else if((x == 3) && (y <= 1)) {
//			System.out.println("病院は空いています");
//		} else if((x == 4) && (y >= 0)) {
//			System.out.println("病院は空いています");
//		} else if((x == 5) && (y >= 1)) {
//			System.out.println("病院は空いています");
//		} else if((x == 6) && (y == 0)) {
//			System.out.println("病院は空いています");
//		} else {
//			System.out.println("休診日のため、病院は空いていません");
//		}


//		3-10
//		BufferedReader br = new BufferedReader(
//				new InputStreamReader(System.in));
//		System.out.println("1つめの数字「x」を入力ください");
//		int x = Integer.parseInt(br.readLine());
//		System.out.println(x);
//		System.out.println("2つめの数字「y」を入力ください");
//		int y = Integer.parseInt(br.readLine());
//		System.out.println(y);
//		if((x < y) && ((x % 2 == 0) && (y % 2 == 0))) {
//			System.out.println("x は y より小さく、かつ、x と y は共に偶数である。");
//		} else if((x == y) && ((x < 0) && (y < 0))) {
//			System.out.println("x と y は等しく、かつ、負の数である。");
//		} else if((x < y) || (x % 2 == 0)) {
//			System.out.println("x は y より小さい、または、x は偶数である。");
//		} else if(((x <= 10) || (x >= 100)) && ((y >= 10) && (y <= 100))) {
//			System.out.println("x は 10 以下または 100 以上で、かつ、y は 10 以上かつ 100 以下である。");
//		} else if((x >= 0) && (y >= 0)) {
//			System.out.println("x も y も負の数である、ではない。（ x も y も負の数である、の否定）");
//		}

//		3-11
//		BufferedReader br = new BufferedReader(
//				new InputStreamReader(System.in));
//		System.out.println("入力した数字の月に含まれている祝日を表示します。好きな月を数字のみで入力ください。");
//		int x = Integer.parseInt(br.readLine());
//		System.out.println(x + "月");
//		switch (x) {
//		case 1:
//			System.out.println("元日、成人の日");
//			break;
//		case 2:
//			System.out.println("建国記念の日");
//			break;
//		case 3:
//			System.out.println("春分の日");
//			break;
//		case 4:
//			System.out.println("昭和の日");
//			break;
//		case 5:
//			System.out.println("憲法記念日、みどりの日、こどもの日");
//			break;
//		case 7:
//			System.out.println("海の日");
//			break;
//		case 9:
//			System.out.println("敬老の日、秋分の日");
//			break;
//		case 10:
//			System.out.println("体育の日");
//			break;
//		case 11:
//			System.out.println("文化の日、勤労感謝の日");
//			break;
//		case 12:
//			System.out.println("天皇誕生日");
//			break;
//		}


//		3-12
//		BufferedReader br = new BufferedReader(
//				new InputStreamReader(System.in));
//		System.out.println("好きなお寿司の番号を入力ください。1:まぐろ, 2:たまご, 3:サーモン");
//		int x = Integer.parseInt(br.readLine());
//		System.out.println(x);
//		switch(x) {
//		case 1:
//			System.out.println("まぐろ一丁！");
//			break;
//		case 2:
//			System.out.println("たまご入りました！");
//			break;
//		case 3:
//			System.out.println("サーモン少しお待ち！");
//			break;
//		default:
//			System.out.println("1~3の番号から選択ください");
//			break;
//		}


//		3-13
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		System.out.println("好きな月を数字で入力ください。入力した月の日数を表示します。");
		int x = Integer.parseInt(br.readLine());
		System.out.println(x + "月");
		switch(x) {
		case 1:
			System.out.println(x + "月は31日です");
			break;
		case 2:
			System.out.println(x + "月は28日です");
			break;
		case 3:
			System.out.println(x + "月は31日です");
			break;
		case 4:
			System.out.println(x + "月は30日です");
			break;
		case 5:
			System.out.println(x + "月は31日です");
			break;
		case 6:
			System.out.println(x + "月は30日です");
			break;
		case 7:
			System.out.println(x + "月は31日です");
			break;
		case 8:
			System.out.println(x + "月は31日です");
			break;
		case 9:
			System.out.println(x + "月は30日です");
			break;
		case 10:
			System.out.println(x + "月は31日です");
			break;
		case 11:
			System.out.println(x + "月は30日です");
			break;
		case 12:
			System.out.println(x + "月は31日です");
			break;
		default:
			System.out.println("1~12の中から入力ください");
		}
	}
}
