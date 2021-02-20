class Shopping {
	double tax = 0.08;
	String item;
	int price;

	Shopping(String i, int p) {
		item = i;
		price = p;
	}
	void buy() {
		int taxIn = (int)(price * (tax + 1));
		System.out.println(item + ":" + taxIn + "円 (本体価格" + price + "円");
	}
}

public class Chap9Ex1 {
	public static void main(String[] args) {
		Shopping s1 = new Shopping("ケーキ", 2000);
		s1.buy();

		Shopping s2 = new Shopping("花束", 2150);
		s2.buy();

//		System.out.println("ケーキ: 2160円 本体価格: 2000円");
//		System.out.println("花束: 2322円 (本体価格2150円");
	}

}
