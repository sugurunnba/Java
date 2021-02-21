
class Person {
	String name;
	String sex;

	void printAbout() {
		System.out.println("名前:" + name);
		System.out.println("性別:" + sex);
	}
}

class Man extends Person {
	String hobby;

	void printProf() {
		printAbout();
		System.out.println("趣味:" + hobby);
	}
}

public class Chap11Ex1 {
	public static void main(String[] args) {
		Man yamada = new Man();

		yamada.name = "山田太郎";
		yamada.sex = "男性";
		yamada.hobby = "プログラミング";

		yamada.printProf();
	}
}
