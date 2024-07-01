//write a program to find the largest number//

import java.util.Scanner;

class program1{

    public static void main(String[] args) {
        int num1, num2;
        Scanner s = new Scanner(System.in);
        num1 = s.nextInt();
        num2 = s.nextInt();
        if (num1 > num2) {
            System.out.println("The largest number is: " + num1);
        } else {
            System.out.println("The largest number is: " + num2);
        }
    }
}
