class Hello {
	String greeting;
	int num;
	void disp() {
		System.out.println(greeting + "今日のラッキーナンバーは" + num);
	}
	Hello(String g, int n) {
		greeting = g;
		num = n;
	}
}

public class Chap9Ex3 {
	public static void main(String[] args) {
//		Hello hello1 = new Hello();
//		hello1.greeting = "こんにちわ";
//		hello1.num = 5;
//		hello1.disp();

		Hello hello1 = new Hello("こんにちわ!", 5);
		hello1.disp();
	}

}
