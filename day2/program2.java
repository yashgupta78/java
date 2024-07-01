/*write a program to read four integer number and display the largest number */
import java.util.Scanner;

public class program2 {

    public static void main(String[] args) {
        int num1, num2, num3, num4;
        Scanner s = new Scanner(System.in);
        num1 = s.nextInt();
        num2 = s.nextInt();
        num3 = s.nextInt();
        num4 = s.nextInt();

        if (num1 > num2 && num1 > num3 && num1 > num4) {
            System.out.println(num1);
        } else if (num2 > num3) {
            System.out.println(num2);
        } else if (num3 > num4) {
            System.out.println(num3);
        } else {
            System.out.println(num4);
        }
    }
}
