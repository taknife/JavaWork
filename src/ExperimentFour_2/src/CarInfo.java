import java.util.*;
public class CarInfo {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		Car c = new Car();
		System.out.print("������Ʒ�ƣ�");
		c.brand = reader.next();
		System.out.print("��������ɫ��");
		c.color = reader.next();
		System.out.print("������۸�");
		c.price = reader.nextFloat();
		System.out.println("---------------");
		c.showCarInfo();
	}
}
