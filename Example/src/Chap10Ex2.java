
class Title {
	void disp(String league, int num) {
		String title = league + "第" + num + "節 順位表";
		System.out.println(title);
	}
}

public class Chap10Ex2 {
	public static void main(String[] args) {
		Title t = new Title();
		t.disp("グラスリーグ", 5);
		
		int i = 0;
		if (args.length == 0) {
			System.out.println("情報が入力されていません。");
		} else {
			for (i = 0; i < args.length; i++) {
				System.out.println((i + 1) + "位:" + args[i]);
			}
		}
	}

}