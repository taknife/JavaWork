/**
 * Time : 2021/4/1 下午2:48
 * Author : Kuns (YuXuan Huang)
 * File : ExperimentTwo_3.java
 * Software : IntelliJ IDEA
 */

import java.util.*;
public class ExperimentTwo_3 {
    public static void main(String[] args) {
        int[][] score = new int[3][3];
        float ave;
        float sum = 0;
        Scanner reader = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.print("Please input Sutdent" + (i+1) +" score : ");
            for (int j = 0; j < 3; j++) {
                score[i][j] = reader.nextInt();
            }
        }
        System.out.println("--------------------------------------");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sum += score[i][j];
            }
            ave = sum/3;
            System.out.println("Sutdent" + (i+1) + " average score : " + ave);
        }
    }
}
