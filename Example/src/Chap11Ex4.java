
abstract class Animal {
	abstract void cry(String a);
}

class Dog extends Animal {
	void cry(String a) {
		System.out.println("犬の鳴き声:" + a);
	}
}

class Cat extends Animal {
	void cry(String a) {
		System.out.println("猫の鳴き声:" + a);
	}
}

public class Chap11Ex4 {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.cry("わん!");

		Cat cat = new Cat();
		cat.cry("にゃ〜");
	}
}