
public class Chapter08 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int num = 1;
		while(num < 5) {
			System.out.println(num * num);
			num++;
		}
		
		int array[] = {1, 4, 14, 25};
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		
		for (int val : array) {
			if (val % 2 == 0) {
				continue;
			}
			System.out.println(val);
		}
	}

}
