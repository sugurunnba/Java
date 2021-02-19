
public class Chap8Ex5 {

	public static void main(String[] args) {
//		九九の計算（答えが奇数になる場合のみ)

		for (int a = 1; a <= 9; a++) {
			for (int b = 1; b <= 9; b++) {
				if ((a * b) % 2 == 0) {
					continue;
				}

				System.out.println(a + " * " + b + " = " + (a * b));
			}
		}

	}

}