
public class Chap5Ex {
	public static void main(String[] args) {
		Magazine m1 = new Magazine();

		m1.title = "日本映画史";
		m1.vol = 1;

		m1.disp();
  }
}

class Magazine{
	String title = "";
	int vol;

	void disp() {
		System.out.println(Header.msg);
		System.out.println(title + vol + "号");

		String note;
		if(vol == 1) {
			note = "購読を開始しました";
		} else {
			note = "バックナンバーは各ジャンル棚にあります";
		}
		System.out.println(note);
	}
}

class Header{
	static String msg = "「図書館ニュース」今週のおすすめ";
}