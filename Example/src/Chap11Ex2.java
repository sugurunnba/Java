
public class Chap11Ex2 {
	public static void main(String[] args) {
		Order order1 = new Order();
		order1.setOrderNum(10);
//		order1.orderNum = 20;
	}
}

class Order {
	private int orderNum = 0;

	void setOrderNum(int oNum) {
		orderNum = oNum;
		System.out.println("注文数:" + orderNum + "個");
	}
}
