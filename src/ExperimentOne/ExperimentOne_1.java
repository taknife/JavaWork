/**
 * Time : 2021/3/25 下午1:48
 * Author : Kuns (YuXuan Huang)
 * File : ExperimentOne_1.java
 * Software : IntelliJ IDEA
 */

/* 实验一 */
import java.util.*;
public class ExperimentOne_1 {
    public static void main(String[] args) {
        int num;
        Scanner reader=new Scanner(System.in);
        System.out.print("请输入分数：");
        num = reader.nextInt();
        if (num >= 90) {
            System.out.println("A");
        } else if (num >=60) {
            System.out.println("B");
        } else {
            System.out.println("C");
        }
    }
}
