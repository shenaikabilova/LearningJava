package Chapter8;

/**
 * Created by ShenaiKabilova
 */
public class Ex5 {
    public static void main(String[] args) {
        /*5. Да се състави програма, която изчислява N-тото число на Фибоначи. Първото и второто число на Фибоначи са 1,
        * всяко => е == на сбора на предходните две. Да се използва рекурсия.*/

        System.out.println(fibonachi(5));
    }

    static public int fibonachi(int n) {
        if(n==0) {
            return 0;
        }
        if(n==1) {
            return 1;
        }
        return fibonachi(n-1)+fibonachi(n-2);
    }
}
