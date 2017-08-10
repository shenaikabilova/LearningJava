package Chapter5;

import java.util.Scanner;

/**
 * Created by ShenaiKabilova
 */
public class Ex5 {
    /*Да се състави програма, която прочита две числа от конзолата - p и q. Да изведе таблица с p реда и q колони, която да съдържа
      числа в => последователност.
      Пример: p=5 и q=5
      11 12 13 14 15
      21 22 23 24 25
      31 32 33 34 35
      41 42 43 44 45
      51 52 55 54 55
    */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int p = input.nextInt();
        int q = input.nextInt();

        for(int row=1; row<=p; row++) {
            for(int col=1; col<=q; col++) {
                System.out.print(row + "" + col + " ");
            }
            System.out.println();
        }
    }
}
