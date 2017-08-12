package Chapter8;

import java.util.Arrays;

/**
 * Created by ShenaiKabilova
 */
public class Ex3 {
    public static void main(String[] args){
        /*3. Да се състави метод, който приема като аргументи два масива и връща масив, съдържащ всичко елементи на
        * двата подадени масива.*/
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};
        int[] arr3 = newArray(arr1, arr2);

        for(int i=0; i<arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
    }

    static int[] newArray(int[] arr1, int[] arr2) {
        int[] newArr = new int[arr1.length+arr2.length];
        System.arraycopy(arr1, 0, newArr, 0, arr1.length);
        System.arraycopy(arr2, 0, newArr, arr1.length, arr2.length);
        return newArr;
    }
}
