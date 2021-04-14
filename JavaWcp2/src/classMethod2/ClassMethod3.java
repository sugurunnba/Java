package classMethod2;

import classMethod.human2.Human3;

public class ClassMethod3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Human3 yamada = new Human3();
		
		System.out.println("私の名前は、" + yamada.name + "です。");
		String profile = yamada.getProfile();
		System.out.println(profile + "です。");
		
		yamada.greet("田辺");
		yamada.greet(null);
	}

}
