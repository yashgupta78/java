
import java.util.Scanner;

public class program2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String day = s.next().toLowerCase();
        switch (day) {
            case "monday":
            case "wednesday": {
                System.out.println("Basket Ball");
            }
            break;
            case "tuesday":
            case "friday": {
                System.out.println("Tennis");

            }
            break;
            case "thursday": {
                System.out.println("Cricket");
            }
            break;
            case "saturday": {
                System.out.println("Excercise");
            }
            break;
            case "sunday": {
                System.out.println("Holiday");
            }
            break;
            default: {
                System.out.println("Invalid day");
            }

        }
    }
}
