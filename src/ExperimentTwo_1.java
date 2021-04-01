/**
 * Time : 2021/4/1 下午1:51
 * Author : Kuns (YuXuan Huang)
 * File : ExperimentTwo_1.java
 * Software : IntelliJ IDEA
 */

import java.util.*;
public class ExperimentTwo_1 {
    public static void main(String[] args) {
        int n;
        float sum = 0;
        float ave;
        Scanner reader = new Scanner(System.in);
        System.out.print("Please input n : ");
        n = reader.nextInt();
        int[] num = new int[n];
        System.out.println("Please input numberArray : ");
        for (int i = 0; i < n; i++) {
            num[i] = reader.nextInt();
            sum += num[i];
        }
        ave = sum/n;
        System.out.println("Average value : " + ave);
        System.out.print("The number greater than the average is : ");
        for (int i = 0; i < n; i++) {
            if (num[i] > ave) {
                System.out.print(num[i]+" ");
            }
        }
    }
}
