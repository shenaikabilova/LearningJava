package Chapter8;

/**
 * Created by ShenaiKabilova
 */
public class Ex1 {
    public static void main(String[] args){
        /*1. Да се състави метод, който приема като аргументи две числа и отпечатва на екрана техния сбор.*/
        add(5,3);
    }

    static void add(int a, int b){
        int sum = a+b;
        System.out.print(a + " + " + b + " = " + sum);
    }
}
