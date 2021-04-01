
public class Chapter0702 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String signal;
		signal = "green";

		switch(signal) {
		case "red":
			System.out.println("赤信号です");
			break;
		case "yellow":
			System.out.println("黄信号です");
			break;
		case "blue":
			System.out.println("青信号です");
			break;
		default:
			System.out.println("信号の色ではありません");
		}

	}

}
