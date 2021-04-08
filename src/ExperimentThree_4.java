/**
 * Time : 2021/4/8 下午2:46
 * Author : Kuns (YuXuan Huang)
 * File : ExperimentThree_4.java
 * Software : IntelliJ IDEA
 */

import java.util.*;
public class ExperimentThree_4 {
    public static void main(String[] args) {
        String str,newStr;
        String ch;
        System.out.print("Please input string : ");
        Scanner reader = new Scanner(System.in);
        str = reader.next();
        System.out.print("Please enter the character to delete : ");
        ch = reader.next();
        newStr = str.replace(ch,"");
        System.out.print("New String : " + newStr);
    }
}
