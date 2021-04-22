package ExperimentFour_1;
import java.util.*;
public class B {
	public static void main(String[] args) {
		int a;
		Scanner reader = new Scanner(System.in);
		A v = new A();
		while (true) {
			System.out.print("请输入a的值：");
			a = reader.nextInt();
			if (a > v.v) {
				System.out.println("大了");
			} else if (a < v.v) {
				System.out.println("小了");
			} else {
				System.out.println("恭喜你，猜对了！");
				break;
			}
		}
	}
}
