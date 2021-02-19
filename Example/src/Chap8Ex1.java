import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Chap8Ex1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			String str;
			int i;

			do {
				System.out.println("「1234」と入力してください。");
				str = br.readLine();
				i = Integer.parseInt(str);
			}while (i != 1234);

//			System.out.println("「1234」と入力してください。");
//			String str = br.readLine();
//			int i = Integer.parseInt(str);
//
//			while (i != 1234) {
//				System.out.println("違います。「1234」と入力してください。");
//				str = br.readLine();
//				i = Integer.parseInt(str);
//			}


			System.out.println("正しく入力されました。");

		} catch (Exception e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}

}
