/**
 * Time : 2021/4/22 14:00
 * Author : Kuns (Huang Yuxuan)
 * Project : Java_Experiment
 * File : Circle.java
 * Software : IntelliJ IDEA
 */
package ExperimentFive_1;
import java.util.*;
public class Circle {
    float radius;
    float pi;
    void setCircle() {
        System.out.print("请输入圆的半径：");
        Scanner reader = new Scanner(System.in);
        radius = reader.nextFloat();
        pi = 3.14f;
    }
    void getPerimeter() {
        float per;
        per = 2 * pi * radius;
        System.out.println("圆的周长为：" + per);
    }
    void getArea() {
        float area;
        area = pi * radius * radius;
        System.out.println("圆的面积为：" + area);
    }
    void getVolume() {
        float volume;
        volume = (4.0f / 3.0f) * pi * radius * radius * radius;
        System.out.println("球的体积为：" + volume);
    }
}
