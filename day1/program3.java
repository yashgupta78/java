//write a program by taking 4 integer to check which is the smallest vlaue //

import java.util.Scanner;

public class program3 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = s.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = s.nextInt();
        System.out.println("Enter the third number: ");
        int num3 = s.nextInt();
        System.out.println("Enter the fourth number: ");
        int num4 = s.nextInt();
        s.close();
        int smallest = num1;
        if (num2 < smallest) {
            smallest = num2;
        }
        if (num3 < smallest) {
            smallest = num3;
        }
        if (num4 < smallest) {
            smallest = num4;
        }
        System.out.println("The smallest number is: " + smallest);
    }
}
