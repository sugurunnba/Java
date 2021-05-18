package pra;
//8-1
//class Animal {
//	public String Name;
//	public int Age;
//
//	public void ShowProfile() {
//		System.out.println("名前は" + Name + "、" + Age + "歳です。");
//	}
//}
//
////animalクラスから継承
//class Cat extends Animal {
//	public void Sleep() {
//		System.out.println("スースー");
//	}
//}
//
//public class lesson8 {
//	public static void main(String[] args) {
//		Cat MyCat = new Cat();
//		MyCat.Name = "たま";
//		MyCat.Age = 3;
//		MyCat.ShowProfile();
//		MyCat.Sleep();
//	}
//}

//class Animal {
//	public String Name;
//	public int Age;
//
//	public void ShowProfile() {
//		System.out.println("名前は" + Name + "、" + Age + "歳です。");
//	}
//
////animalクラスから継承
//class Cat extends Animal {
//	public void Sleep() {
//		System.out.println("スースー");
//	}
//}
//
//class Dog extends Animal {
//	public void Run() {
//		System.out.println("トコトコ");
//	}
//}
//
//public class lesson8 {
//	public static void main(String[] args) {
//		Cat MyCat = new Cat();
//		Dog MyDog = new Dog();
//		MyCat.Name = "たま";
//		MyDog.Name = "ぽち";
//		MyCat.Age = 3;
//		MyDog.Age = 2;
//		MyCat.ShowProfile();
//		MyDog.ShowProfile();
//		MyCat.Sleep();
//		MyDog.Run();
//	}
//}



//8-3
//class Animal {
//	public String Name;
//	public int Age;
//
//	public void ShowProfile() {
//		System.out.println("名前は" + Name + "、" + Age + "歳です。");
//	}
//	public void Speak() {
//		System.out.println("......");
//	}
//}
////animalクラスから継承
//class Cat extends Animal {
//	public void Sleep() {
//		System.out.println("スースー");
//	}
//	public void Speak() {
//		System.out.println("にゃー");
//	}
//}
//class Dog extends Animal {
//	public void Run() {
//		System.out.println("トコトコ");
//	}
//	public void Speak() {
//		System.out.println("わんわん");
//	}
//}
//
//public class lesson8 {
//	public static void main(String[] args) {
//		Cat MyCat = new Cat();
//		Dog MyDog = new Dog();
//		MyCat.Name = "たま";
//		MyDog.Name = "ぽち";
//		MyCat.Age = 3;
//		MyDog.Age = 2;
//		MyCat.ShowProfile();
//		MyDog.ShowProfile();
//		MyCat.Sleep();
//		MyDog.Run();
//		MyDog.Speak();
//		MyCat.Speak();
//	}
//
//}



//8-4
class Animal {
	public String Name;
	public int Age;

	public void ShowProfile() {
		System.out.println("名前は" + Name + "、" + Age + "歳です。");
	}
	public void Speak() {
		System.out.println("......");
	}
}
//animalクラスから継承
class Cat extends Animal {
	public void Sleep() {
		System.out.println("スースー");
	}
	public void Speak() {
		System.out.println("にゃー");
	}
}
class Dog extends Animal {
	public void Run() {
		System.out.println("トコトコ");
	}
	public void Speak() {
		System.out.println("わんわん");
	}
}

public class lesson8 {
	public static void main(String[] args) {
		Animal[] MyPets = new Animal[4];
		MyPets[0] = new Cat();
		MyPets[1] = new Dog();
		MyPets[2] = new Cat();
		MyPets[3] = new Dog();
		
//		MyPetsの配列情報を新たに定義したAnimal型のPetへ代入。その後Speakメソッドを実行させている。
		for(Animal Pet: MyPets) {
			Pet.Speak();
		}
	}
}