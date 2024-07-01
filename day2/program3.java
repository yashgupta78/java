/* Design a program that tracks o penson's dally steps and categorizes their activity level based on the number of steps taiken. Implement on alsa-if ladder that telees ha number of steps as input and outputs the corresponding activity level according to the following criteria
Less than 5000 steps: Sedentary
5000 to 7499 steps: Low Active
7500 to 9999 steps: Somewhat Active
10000 to 12499 steps Active
12500 or more steps: Highly Active */

import java.util.Scanner;

public class program3 {

    public static void main(String[] args) {
        int steps;
        Scanner s = new Scanner(System.in);
        steps = s.nextInt();

        if (steps < 5000) {
            System.out.println("Sedentary");
        } else if (steps < 7500) {
            System.out.println("Low Active");
        } else if (steps < 10000) {
            System.out.println("Somewhat Active");
        } else if (steps < 12500) {
            System.out.println("Active");
        } else {
            System.out.println("Highly Active");
        }
        s.close();
    }
}
