package Chapter9;

import java.util.Scanner;

/**
 * Created by ShenaiKabilova
 */
public class Ex3 {
    public static void main(String[] args){
        /*3. Да се състави програма, чрез която се въвеждат 2 редици от знаци. Ако в двете редици участва един и същи
        * знак, да се изведе на едкрана първата редица хоризонтално, а втората вертикално, така че да се пресичат в общия
        * си знак. Ако редиците нямат общ знак, да се изведе само уведомително съобщение.
        * Пример:                      Изход: м
        * шапка                               а
        * машина                              шапка
        *                                     и
        *                                     н
        *                                     а*/

        Scanner input = new Scanner(System.in);
        String s1 = input.nextLine();
        String s2 = input.nextLine();
        boolean hasCommonChar = false;

        for(int j=0; j<s2.length(); j++) {
            if (s1.charAt(0) == s2.charAt(j)) {
                hasCommonChar = true;
                print(s2, s1, j);
                break;
            }
        }

        if(!hasCommonChar) {
            System.out.println("Нямат общи символи.");
        }
    }

    public static void print(String s1, String s2, int positionS1) {
        for(int i=0; i<s1.length(); i++) {
            if(i != positionS1) {
                System.out.println(s1.charAt(i));
            }
            else System.out.println(s2);
        }
    }
}
