package Chapter6;

/**
 * Created by ShenaiKabilova
 */
public class Ex3 {
    public static void main(String[] args) {
        /*3. Даден е масив с 5 елемента - цели числа. Да се изведе най-голямото число в масива.*/
        int[] array = {5, 6, 1, 10, 2};
        int max = array[0];

        for(int i=0; i<array.length; i++) {
                if(max < array[i]) {
                    max = array[i];
            }
        }

        System.out.println(max);
    }
}
