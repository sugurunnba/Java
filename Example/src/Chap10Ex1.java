
class Exchange {
	int jpy;
	double usd, rate;
	double calc(int i, double r) {
		return i / r;
	}

	void disp() {
		usd = calc(jpy, rate);
		System.out.println(jpy + "円 = " + usd + "ドル (1ドル: " + rate + "円) ");
	}

	Exchange(int j, double r) {
		jpy = j;
		rate = r;
	}
}

public class Chap10Ex1 {
	public static void main(String[] args) {
		msg();
//		System.out.println("円→ドルに換算します。");

		Exchange ec = new Exchange(2500, 91.16);
//		ec.jpy = 2500;
//		ec.rate = 91.16;
		ec.disp();
	}

	static void msg() {
		System.out.println("円→ドルに換算します。");
	}

}
