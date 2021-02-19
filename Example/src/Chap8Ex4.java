import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Chap8Ex4 {
	public static void main(String[] args){
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			System.out.println("海に接していない都道府県名を1つ答えてください。");
			String str = br.readLine();

			String []nairiku = {"栃木", "群馬", "埼玉", "山梨", "長野", "岐阜", "滋賀", "奈良"};

			boolean correct = false;

			quiz:
			for (int a = 1; a < 3; a++) {
				for (int b = 0; b < nairiku.length; b++) {
					if (str.equals(nairiku[b])) {
						correct = true;
						break quiz;
					}
				}
				System.out.println("違います。もう一度!");
				str = br.readLine();
			}
			if(correct) {
				System.out.println("正解!");
			}else {
				System.out.println("残念！また挑戦ください。");
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
