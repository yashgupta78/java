/* 1.Write a program to find all the prime numbers between a given range .
Constraints : User needs to enter the range (lower bound and upper bound) 
where lower bound < upper bound and lower bound > 2 . If these conditions 
are not satisfied then program should print Invalid range.

2.Write a program to find count of prime numbers present  between a given range.
Constraints : User needs to enter the range (lower bound and upper bound) 
where lower bound < upper bound and lower bound > 2 . 
If these conditions are not satisfied then program should print Invalid range.

3.Write a java program to count the number of factors of a given integer number.
*/


import java.util.Scanner;
public class program1
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        int lowerBound = s.nextInt();
        int upperBound = s.nextInt();
        if (!(lowerBound < upperBound && lowerBound > 2))
        {
            System.err.println("Invalid Range");
            return;
        }
        for (int i = lowerBound; i <= upperBound; i++) 
        {
            if (isPrime(i))
            {
                System.out.print(i + " ");
            }
        }  
    }
    public static boolean isPrime(int num) 
    {
        if (num <= 1) 
        {
            return false;
        }
        for (int i = 2; i * i <= num; i++) 
        {
            if (num % i == 0)
            {
                return false;
            }
        }
        return true;
    }
}