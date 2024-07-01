/*
Write a Java Program to print the Factorial of the given number.
Test Case 1: 
	Input : 3
	Output : 6

Test Case 2: 
	Input : 5
	Output : 120

Test Case 3: 
	Input : 9
	Output : 362880
 */

import java.util.Scanner;

class Program1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int result = 1;   //1factorial 
        int i = 2;
        while (i <= n) {
            result = i++ * result;
            System.out.println(result);

        }
    }
}
