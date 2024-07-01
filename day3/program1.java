
import java.util.Scanner;

public class program1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int count = 0;
        int num1 = s.nextInt();
        if (num1 % 2 == 0) {
            count++;
        }
        int num2 = s.nextInt();
        // using conditional operator 
        count = num2 % 2 == 0 ? count + 1 : count;
        int num3 = s.nextInt();
        count = num3 % 2 == 0 ? count + 1 : count;
        //switch

        switch (count) {
            case 1: {
                if (num1 % 2 == 0) {
                    System.out.println("First number is even: " + num1);
                }
                if (num2 % 2 == 0) {
                    System.out.println("second number is even: " + num2);
                }
                if (num3 % 2 == 0) {
                    System.out.println("Third number is even: " + num3);
                }
            }
            break;

            case 2: {
                int sum1 = num1 + num2;
                int sum2 = num1 + num3;
                int sum3 = num3 + num2;
                if (num1 % 2 == 0 && num2 % 2 == 0) {
                    System.out.println("First two numbers are even: " + sum1);
                }
                if (num1 % 2 == 0 && num3 % 2 == 0) {
                    System.out.println("First and third numbers are even: " + sum2);
                }
                if (num3 % 2 == 0 && num2 % 2 == 0) {
                    System.out.println("Second and third numbers are even: " + sum3);
                }
            }
            break;
            case 3: {
                System.out.println(num1 * num2 * num3);
            }
            break;
            default: {
                System.out.println("Invalid");
            }
        }
    }

}
