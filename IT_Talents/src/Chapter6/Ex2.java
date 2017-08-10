package Chapter6;

import java.util.Arrays;

/**
 * Created by ShenaiKabilova
 */
public class Ex2 {
    public static void main(String[] args){
        /*2. По дадени два масива да се провери дали първият, обърнат наобратно, е еднакъв с втория.*/

        //I
        int[] arr2 = {1,2,3};
        int[] arr3 = {3,2,1};

        for(int i=0; i<arr2.length; i++) {
            for(int j=i; j<arr2.length; j++) {
                int temp = arr2[i];
                arr2[i] = arr2[j];
                arr2[j] = temp;
            }
        }

        System.out.println(Arrays.toString(arr2));

        if(arr2.length != arr3.length) {
            System.out.println("Arrays are different.");
        } else {
            boolean isDifferent = false;
            for(int i=0; i<arr2.length; i++) {
                if(arr2[i] != arr3[i]) {
                    isDifferent = true;
                    break;

                }
            }

            if(isDifferent) {System.out.println("Arrays are different.");}
            else {System.out.println("Arrays are not different.");}
        }

        //II
        int[] arr4 = {1,2,4,5};
        int[] arr5 = {3,2,1};
        if(arr4.length != arr5.length) {
            System.out.println("Arrays are different.");
        } else {
            boolean isDifferent = false;
            for (int i = 0, j=arr5.length-1; i < arr4.length && j>=0; i++, j--) {
                    if (arr4[i] != arr5[j]) {
                        isDifferent = true;
                        break;
                }
            }
            if(isDifferent) {System.out.println("Arrays are different.");}
            else {System.out.println("Arrays are not different.");}
        }

    }
}
