package Chapter9;

import java.util.Scanner;

/**
 * Created by ShenaiKabilova
 */
public class Ex2 {
    public static void main(String[] args){
        /*2. Да се състави програма, чрез която се въвеждат последователно две редици от символи без интервали.
        * Програмата да извежда съобщение за резултата от сравнението им по позиции.
        * Пример:
        * хипопотам
        * хипопотук
        * Изход:
        * Двата низа са с равна дължина.
        * Разлика по позиции:
        * 8 а-у
        * 9 м-к*/

        Scanner input = new Scanner(System.in);
        String s1 = input.nextLine();
        String s2 = input.nextLine();

        System.out.println(s1.length() == s2.length() ? "Двата низа са с равна дължина." :
                                                        "Двата низа са с различна дължина.");

        for(int i=0, j=0; i<s1.length() && j<s2.length(); i++, j++){
            if(i<=j){
                if(s1.charAt(i) != s2.charAt(j)){
                    System.out.println(i+1 + " " + s1.charAt(i) + "-" + s2.charAt(j));
                }
            }
        }
    }
}
