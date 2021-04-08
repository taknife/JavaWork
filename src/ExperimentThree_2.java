/**
 * Time : 2021/4/8 下午2:19
 * Author : Kuns (YuXuan Huang)
 * File : ExperimentThree_2.java
 * Software : IntelliJ IDEA
 */

import java.util.*;
public class ExperimentThree_2 {
    public static void main(String[] args) {
        String str;
        int let = 0;
        int num = 0;
        int oth = 0;
        System.out.println("Please input string :");
        Scanner reader = new Scanner(System.in);
        str = reader.next();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                num++;
            } else if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                let++;
            } else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                let++;
            } else {
                oth++;
            }
        }
        System.out.println("Letters : " + let);
        System.out.println("Numbers : " + num);
        System.out.println("Others : " + oth);
    }
}
