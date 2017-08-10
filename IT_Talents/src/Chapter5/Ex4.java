package Chapter5;

import java.util.Scanner;

/**
 * Created by ShenaiKabilova
 */
public class Ex4 {
    //Да се въведе число от конзолата и да се определи дали е просто.
    //Просто число е това, което се дели само на 1 и на себе си.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        if(number>3 && (number%2==0 || number%3==0 || number%5==0)) {
            System.out.print("ne e prosto");
        }
        else System.out.print("prosto");
    }
}
