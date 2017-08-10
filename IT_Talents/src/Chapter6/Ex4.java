package Chapter6;

/**
 * Created by ShenaiKabilova
 */
public class Ex4 {
    public static void main(String[] args) {
        /*4. По даден масив с 5 символа, променливи от тип char, да се провери дали някой от тези символи е с малка
        * латинска буква.*/

        char[] arr = {'D', 'B', 'z', 'D', 'A'};
        boolean isLowercase = false;

        for(int i=0; i<arr.length; i++) {
            if(arr[i]>=97 && arr[i]<=122){
                isLowercase = true;
                break;
            }
        }

        if(isLowercase) { System.out.println("Array has lowercase symbor"); }
        else { System.out.println("Array has not lowercase symbol"); }
    }
}
