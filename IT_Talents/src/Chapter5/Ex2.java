package Chapter5;

/**
 * Created by ShenaiKabilova
 */
public class Ex2 {
    //Да се узведат в конзолата всички нечетни числа от 1 до 40.
    public static void main(String[] args) {
        for(int i=0; i<=40; i++) {
            if(i%2 != 0)
                System.out.print(i + " ");
        }
    }
}
