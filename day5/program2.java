/*
Write a program to find the factors for a given natural numbers.
Test Case 1: 
	Input : 9
	Output : 1,3,9

Test Case 2: 
	Input : 15 
	Output : 1,3,5,15
*/
import java.util.Scanner;
public class program2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num =s.nextInt();
        int count = 1;
       // System.out.print(1 + ",");
        for(int i = 1 ; i <= num / 2; i++){
            if(num % i == 0){
                System.out.print(i + ",");
                count++ ; 
            }
        }
        System.out.println(num);
        System.err.println(count);
    }
}