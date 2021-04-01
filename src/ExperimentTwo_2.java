/**
 * Time : 2021/4/1 下午2:11
 * Author : Kuns (YuXuan Huang)
 * File : ExperimentTwo_2.java
 * Software : IntelliJ IDEA
 */
public class ExperimentTwo_2 {
    public static void main(String[] args) {
        int[] num = {0, 2, 1, 2, 4, 6, 6};
        int[] num_copy = new int[num.length];
        System.out.println("Print initialization array :");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.print("\n");
        int a = 0;
        GO : for (int i = 0; i < num.length - 1; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] == num[j]) {
                    continue GO;
                }
                num_copy[a] = num[i];
            }
            a++;
        }
        num_copy[a] = num[num.length - 1];
        System.out.println("Filtered array :");
        for (int i = 0; i <= a; i++){
            System.out.print(num_copy[i] + " ");
        }
        System.out.print("\n");
    }
}
