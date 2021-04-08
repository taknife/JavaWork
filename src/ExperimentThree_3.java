/**
 * Time : 2021/4/8 下午2:30
 * Author : Kuns (YuXuan Huang)
 * File : ExperimentThree_3.java
 * Software : IntelliJ IDEA
 */

import java.util.*;
public class ExperimentThree_3 {
    public static void main(String[] args) {
        String str, str_z;
        int s, l;
        System.out.print("Please input string : ");
        Scanner reader = new Scanner(System.in);
        str = reader.next();
        System.out.print("Start (Start with 1) : ");
        s = reader.nextInt();
        System.out.print("Length : ");
        l = reader.nextInt();
        str_z = str.substring(s - 1,s + l - 1);
        System.out.print("Substring : " + str_z);
    }
}
