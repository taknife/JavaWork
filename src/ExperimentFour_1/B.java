package ExperimentFour_1;
import java.util.*;
public class B {
	public static void main(String[] args) {
		int a;
		Scanner reader = new Scanner(System.in);
		A v = new A();
		while (true) {
			System.out.print("������a��ֵ��");
			a = reader.nextInt();
			if (a > v.v) {
				System.out.println("����");
			} else if (a < v.v) {
				System.out.println("С��");
			} else {
				System.out.println("��ϲ�㣬�¶��ˣ�");
				break;
			}
		}
	}
}
