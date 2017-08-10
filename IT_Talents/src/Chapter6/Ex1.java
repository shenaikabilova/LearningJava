package Chapter6;

import java.util.Scanner;

/**
 * Created by ShenaiKabilova
 */
public class Ex1 {
    public static void main(String[] args) {
        /*1. Прочетете масив от екрана с 10 елемента - числа с плаваща запетая, и изведете сумата на елементите в масива.*/
        Scanner input = new Scanner(System.in);
        double[] arr1 = new double[10];
        double sumArr = 0;

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = input.nextInt();
            sumArr += arr1[i];
        }
        System.out.println(sumArr);
    }
}