/**
 * Time : 2021/4/8 下午1:58
 * Author : Kuns (YuXuan Huang)
 * File : ExperimentThree_1.java
 * Software : IntelliJ IDEA
 */

import java.util.*;
public class ExperimentThree_1 {
    public static void main(String[] args) {
        String str;
        int a = 0;
        System.out.println("Please input string :");
        Scanner reader = new Scanner(System.in);
        str = reader.next();
        char[] reStr = new char[str.length()];
        for (int i = str.length() - 1; i >= 0; i--) {
            reStr[a] = str.charAt(i);
            a++;
        }
        System.out.println("The result is in reverse order :");
        for (int i = 0; i < reStr.length; i++) {
            System.out.print(reStr[i]);
        }
    }
}
