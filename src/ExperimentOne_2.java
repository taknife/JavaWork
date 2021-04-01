/**
 * Time : 2021/3/25 下午2:18
 * Author : Kuns (YuXuan Huang)
 * File : ExperimentOne_2.java
 * Software : IntelliJ IDEA
 */
public class ExperimentOne_2 {
    public static void main(String[] args) {
        int g, s, b;
        for (int i = 100; i <= 999; i++) {
            g = i % 10;
            s = i / 10 % 10;
            b = i / 100;
            if (g * g * g + s * s * s + b * b * b == i) {
                System.out.println(i);
            }
        }
    }
}
