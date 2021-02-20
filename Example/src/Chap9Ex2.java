class Book {
	String title;
	String auther;

	void disp() {
		System.out.println("『" + title + "』(著:" + auther + ")");
	}
}

public class Chap9Ex2 {
	public static void main(String[] args) {
//		System.out.println("『吾輩は猫である』(著 : 夏目漱石) ");
		Book book1;
		book1 = new Book();
		book1.title = "吾輩は猫である";
		book1.auther = "夏目漱石";
		book1.disp();
	}
}
