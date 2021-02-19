import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Chap7Ex6 {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			System.out.println("名前を入力してください。");
			String name = br.readLine();
			System.out.println("ようこそ" + name + "さん。");

			System.out.println("クイズ:「蒲公英」の読み方をひらがなで答えてください。");
			String a = br.readLine();
			int len = a.length();

			while (!a.equals("たんぽぽ")) {
				if(len == 4) {
					System.out.println("残念! でも4文字です");
				}
				else if(len < 4) {
					System.out.println("残念! もっと長いです。");
				}
				else if(len > 4) {
					System.out.println("残念! もっと短いです。");
				}
				a = br.readLine();
				len = a.length();
			}

			System.out.println("正解です!");

		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}
}
