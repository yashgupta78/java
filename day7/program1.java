/*
Write a program to Calculate the LCM of 
two given natural numbers.

Test Case 1: 
	Input : 15 
	Input : 25
	Output: 75

Test Case 2: 
	Input : 20
	Input : 30
	Output: 60
*/
import java.util.Scanner;

class program1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //s1: read 2 numbers
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        //s2: find largest number
        int i = num1 > num2 ? num1 : num2;  //initialize with largest
        //s3: find lcm
        while (true) {
            if (i % num1 == 0 && i % num2 == 0) {
                //i is a lcm of num1 and num2
                System.out.println(i);
                //stop the loop
                break;
            }
            i++;

        }
    }
}