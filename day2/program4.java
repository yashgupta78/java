/* write a program to check weather a given sides of a triangle forms a pythagorean triple . prompt the user to input the lengths of the three sides of the triangle of the three sides of the triangle 
 * then , determine and display whether the triangle satisfies the pythagorean theorem
 * explanation : this is well known as  pythagorean triple where 3^2 + 4^2 = 5^2 satisfying the pythagorean theorem.
 */

import java.util.Scanner;

public class program4 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        System.out.println("Enter the length of the first side of the triangle: " + a);
        int b = s.nextInt();
        System.out.println("Enter the length of the second side of the triangle: " + b);
        int c = s.nextInt();
        System.out.println("Enter the length of the third side of the triangle: " + c);
        if ((a * a + b * b) == (c * c)) {
            System.out.println("Is a pythagorean tripplet: true ");
        } else if ((a * a + c * c) == (b * b)) {
            System.out.println("Is a pythagorean tripplet: true ");
        } else if ((b * b + c * c) == (a * a)) {
            System.out.println("Is a pythagorean tripplet: true ");
        } else {
            System.out.println("Is a pythagorean tripplet: false ");
        }
    }
}
