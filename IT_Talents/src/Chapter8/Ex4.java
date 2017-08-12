package Chapter8;

import java.util.Arrays;

/**
 * Created by ShenaiKabilova
 */
public class Ex4 {
    public static void main(String[] args) {
        /*4. Да се състави метод, който приема като аргументи две числа X и Y и връща като резултат двумерен масив с X реда
        * и Y колони, като във всяка клетка на масива се намира цифрата 0.*/

        int[][] arr = dimArray(5, 3);
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

    static int[][] dimArray(int x, int y){
        int[][] newArr = new int[x][y];

        //I
        for(int row=0; row<newArr.length; row++) {
            Arrays.fill(newArr[row], 0);
        }


        //II
//        for(int row=0; row<newArr.length; row++) {
//            for(int col=0; col<newArr[0].length; col++) {
//                newArr[row][col] = 0;
//        }
//        }
        return newArr;
    }
}
