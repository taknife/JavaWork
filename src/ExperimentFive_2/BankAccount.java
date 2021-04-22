/**
 * Time : 2021/4/22 14:19
 * Author : Kuns (Huang Yuxuan)
 * Project : Java_Experiment
 * File : BankAccount.java
 * Software : IntelliJ IDEA
 */
package ExperimentFive_2;
import java.util.*;
public class BankAccount {
    String account;
    float leftMoney;
    Scanner reader = new Scanner(System.in);
    void setBankAccount() {
        System.out.print("请输入账号：");
        account = reader.next();
        System.out.print("请输入余额：");
        leftMoney = reader.nextFloat();
    }
    void saveMoney() {
        float save;
        System.out.print("请输入存款金额：");
        save = reader.nextFloat();
        leftMoney += save;
    }
    void getMoney() {
        float get;
        System.out.print("请输入取款金额：");
        get = reader.nextFloat();
        leftMoney -= get;
    }
    void getLeftMoney() {
        System.out.println(account + "的账户余额为：" + leftMoney);
    }
}
