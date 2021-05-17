package pra;

//7-1
//class Dog {
//	private String Name;
//	public void setName(String nm) {
//		Name = nm;
//	}
//	public void ShowProfile() {
//		System.out.println("名前は" + Name + "です。");
//	}
//}
//
//public class lesson7{
//	public static void main(String[] args) {
//		Dog MyDog = new Dog();
//		MyDog.setName("ぽち");
//		MyDog.ShowProfile();
//	}
//}

//7-2
//class Dog {
//	private String Name;
//	private int Age;
//	public void setName(String nm) {
//		Name = nm;
//	}
//	public void setAge(int ag) {
//		Age = ag;
//	}
//	public void ShowProfile() {
//		System.out.println("名前は" + Name + "です");
//		System.out.println("年齢は" + Age + "です");
//	}
//}
//
//public class lesson7{
//	public static void main(String[] args) {
//		Dog MyDog = new Dog();
////		7-3(もう一つのインスタンスを作成/情報をセット/表示)
//		Dog YourDog = new Dog();
//		MyDog.setName("ぽち");
//		YourDog.setName("まめ");
//		MyDog.setAge(5);
//		YourDog.setAge(2);
//		MyDog.ShowProfile();
//		YourDog.ShowProfile();
//	}
//}

//7-4
//class Dog{
//	private String Name;
//	private int Age;
//	private String Kind;
//
//	public Dog(String kd) {
//		Kind = kd;
//	}
//	public void setName(String nm) {
//		Name = nm;
//	}
//	public void setAge(int ag) {
//		Age = ag;
//	}
//	public void ShowProfile() {
//		System.out.println("名前は" + Name + "です");
//		System.out.println("年齢は" + Age + "です");
//		System.out.println("犬種は" + Kind + "です");
//	}
//}
//
//public class lesson7{
//	public static void main(String[] args) {
//		Dog MyDog = new Dog("秋田犬");
//		MyDog.setName("まめ");
//		MyDog.setAge(2);
//		MyDog.ShowProfile();
//	}
//}

//7-5
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
//class CoinCase {
//	private int Yen500 = 0;
//	private int Yen100 = 0;
//	private int Yen50 = 0;
//	private int Yen10 = 0;
//	private int Yen5 = 0;
//	private int Yen1 = 0;
//
//	public void AddCoins(int kind, int count) {
//		switch(kind) {
//		case 500:
//			Yen500 += count;
//			break;
//		case 100:
//			Yen100 += count;
//			break;
//		case 50:
//			Yen50 += count;
//			break;
//		case 10:
//			Yen10 += count;
//			break;
//		case 5:
//			Yen5 += count;
//			break;
//		case 1:
//			Yen1 += count;
//			break;
//		}
//	}
//	public int GetCount(int kind) {
//		switch(kind) {
//		case 500:
//			return Yen500;
//		case 100:
//			return Yen100;
//		case 50:
//			return Yen50;
//		case 10:
//			return Yen10;
//		case 5:
//			return Yen5;
//		case 1:
//			return Yen1;
//		}
//		return 0;
//	}
//	public int GetAmount() {
//		return(Yen500 * 500) + (Yen100 * 100) + (Yen50 * 50) + (Yen10 * 10) + (Yen5 * 5) + Yen1;
//	}
//}
//public class lesson7 {
//	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(
//				new InputStreamReader(System.in));
//		CoinCase MyCase = new CoinCase();
//
//		for(int i = 0; i < 10; i++) {
//			System.out.println("硬貨の種類は?(1円~500円のうち、数字のみで1つを入力ください)");
//			int kind = Integer.parseInt(br.readLine());
//			System.out.println("硬貨の枚数は?");
//			int count = Integer.parseInt(br.readLine());
//
//			MyCase.AddCoins(kind, count);
//		}
//
//		System.out.println("500円は" + MyCase.GetCount(500) + "枚");
//		System.out.println("100円は" + MyCase.GetCount(100) + "枚");
//		System.out.println("50円は" + MyCase.GetCount(50) + "枚");
//		System.out.println("10円は" + MyCase.GetCount(10) + "枚");
//		System.out.println("5円は" + MyCase.GetCount(5) + "枚");
//		System.out.println("1円は" + MyCase.GetCount(1) + "枚");
//		System.out.println("総額は" + MyCase.GetAmount() + "円");
//	}
//}

//7-6
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class CoinCase {
	private int Yen500 = 0;
	private int Yen100 = 0;
	private int Yen50 = 0;
	private int Yen10 = 0;
	private int Yen5 = 0;
	private int Yen1 = 0;

	public void AddCoins(int kind, int count) {
		switch(kind) {
		case 500:
			Yen500 += count;
			break;
		case 100:
			Yen100 += count;
			break;
		case 50:
			Yen50 += count;
			break;
		case 10:
			Yen10 += count;
			break;
		case 5:
			Yen5 += count;
			break;
		case 1:
			Yen1 += count;
			break;
		}
	}
	public int GetCount(int kind) {
		switch(kind) {
		case 500:
			return Yen500;
		case 100:
			return Yen100;
		case 50:
			return Yen50;
		case 10:
			return Yen10;
		case 5:
			return Yen5;
		case 1:
			return Yen1;
		}
		return 0;
	}

//	GetCount(int kind)をオーバーロード
	public int GetCount() {
		return Yen500 + Yen100 + Yen50 + Yen10 + Yen5 + Yen1;
	}

	public int GetAmount() {
		return(Yen500 * 500) + (Yen100 * 100) + (Yen50 * 50) + (Yen10 * 10) + (Yen5 * 5) + Yen1;
	}

//	GetAmount()をオーバーロード
	public int GetAmount( int kind) {
		switch(kind){
		case 500:
			return Yen500 * 500;
		case 100:
			return Yen100 * 100;
		case 50:
			return Yen50 * 50;
		case 10:
			return Yen10 * 10;
		case 5:
			return Yen5 * 5;
		case 1:
			return Yen1;
		}
		return 0;
	}
}
public class lesson7 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		CoinCase MyCase = new CoinCase();

		for(int i = 0; i < 10; i++) {
			System.out.println("硬貨の種類は?(1円~500円のうち、数字のみで1つを入力ください)");
			int kind = Integer.parseInt(br.readLine());
			System.out.println("硬貨の枚数は?");
			int count = Integer.parseInt(br.readLine());

			MyCase.AddCoins(kind, count);
		}

		System.out.println("500円は" + MyCase.GetCount(500) + "枚、" + MyCase.GetAmount(500) + "円");
		System.out.println("100円は" + MyCase.GetCount(100) + "枚、" + MyCase.GetAmount(100) + "円");
		System.out.println("50円は" + MyCase.GetCount(50) + "枚、" + MyCase.GetAmount(50) + "円");
		System.out.println("10円は" + MyCase.GetCount(10) + "枚、" + MyCase.GetAmount(10) + "円");
		System.out.println("5円は" + MyCase.GetCount(5) + "枚、" + MyCase.GetAmount(5) + "円");
		System.out.println("1円は" + MyCase.GetCount(1) + "枚、" + MyCase.GetAmount(1) + "円");
		System.out.println("全部で" + MyCase.GetCount() + "枚");
		System.out.println("総額は" + MyCase.GetAmount() + "円");
	}
}
//System.out.println("");
