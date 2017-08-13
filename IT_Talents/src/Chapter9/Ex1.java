package Chapter9;

import java.util.Scanner;

/**
 * Created by ShenaiKabilova
 */
public class Ex1 {
    public static void main(String[] args){
        /*1. Да се състави програма, чрез която от клавиатурата се въвеждат последователно две думи с дължина до 20 знака.
        * Програмата да размени първите им 5 знака и да изведе дължината на по-дългата, както и новото й съдържание.
        * Пример:
        * uchilishte uchenik
        * Изход: 10 uchenishte*/

        Scanner input = new Scanner(System.in);
        String s1 = input.next();
        String s2 = input.next();

        String newStr = s2.substring(0, 5) + s1.substring(5);
        if(s1.length()>s2.length()) {
            System.out.print(s1.length() + " " + newStr);
        }
        else {
            System.out.print(s2.length() + " " + newStr);
        }
    }
}
