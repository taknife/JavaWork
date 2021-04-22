/**
 * Time : 2021/4/22 14:38
 * Author : Kuns (Huang Yuxuan)
 * Project : Java_Experiment
 * File : AccountOperation.java
 * Software : IntelliJ IDEA
 */
package ExperimentFive_2;

public class AccountOperation {
    public static void main(String[] args) {
        BankAccount bank = new BankAccount();
        bank.setBankAccount();
        bank.saveMoney();
        bank.getMoney();
        bank.getLeftMoney();
    }
}
