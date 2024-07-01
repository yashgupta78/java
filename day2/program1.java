/* to design an application to rad age of three siblings ramu , raghu , raju and store them in a variable the application 
 * when executed should display the age of the youngest sibling
 */
import java.util.Scanner;

public class program1 {

    public static void main(String[] args) {
        int ramu, raghu, raju;
        Scanner s = new Scanner(System.in);
        ramu = s.nextInt();
        raghu = s.nextInt();
        raju = s.nextInt();
        if (ramu < 0 || raghu < 0 || raju < 0) {
            System.out.println("Invalid input");
        } else if (ramu < raghu && ramu < raju) {
            System.out.println("Ramu is younger: " + ramu);
        } else if (raghu < raju) {
            System.out.println("Raghu is younger: " + raghu);
        }
         else {
            System.out.println("Raju is younger: " + raju);
        }
    }

}
