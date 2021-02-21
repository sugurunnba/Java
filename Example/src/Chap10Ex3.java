
class Account {
	int month, in, out;

	Account(int a, int b, int c) {
		month = a;
		in = b;
		out = c;
	}
}

class AccountManager {
	static int total = 0;

	static void calc(int m, int i, int o) {
		System.out.println("【" + m + "月収支】");
		System.out.println("前月繰越:" + total + "円");
		System.out.println("収入:" + i + "円");
		System.out.println("支出:" + o + "円");

		total += (i - o);
		System.out.println("-------------合計:" + total + "円");

		if (total < 0) alert();
	}

	static void alert() {
		System.out.println("*収支合計がマイナスになっています!\n");
	}
}

public class Chap10Ex3 {
	public static void main(String[] args) {
		Account a1 = new Account(1, 2000, 1500);
		Account a2 = new Account(2, 1000, 2000);

		AccountManager.calc(a1.month, a1.in, a1.out);
		AccountManager.calc(a2.month, a2.in, a2.out);
	}
}