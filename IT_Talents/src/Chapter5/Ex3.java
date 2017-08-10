package Chapter5;

import java.util.Scanner;

/**
 * Created by ShenaiKabilova
 */
public class Ex3 {
    //Да се прочете число от конзолата и да се изведе сборът на всички числа от 1 до въведенето число.
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int sum = 0;

        for(int i=1; i<= number; i++) {
            sum+=i;
        }

        System.out.print(sum);
    }
}
