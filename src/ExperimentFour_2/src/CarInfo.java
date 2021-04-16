import java.util.*;
public class CarInfo {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		Car c = new Car();
		System.out.print("请输入品牌：");
		c.brand = reader.next();
		System.out.print("请输入颜色：");
		c.color = reader.next();
		System.out.print("请输入价格：");
		c.price = reader.nextFloat();
		System.out.println("---------------");
		c.showCarInfo();
	}
}
