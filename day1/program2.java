//write a java program to read two character and print the character with smallest ASCI//
import java.util.Scanner;

public class program2 {

    public static void main(String[] args) {
        char ch1, ch2;
        Scanner s = new Scanner(System.in);
        ch1 = s.next().charAt(0);
        ch2 = s.next().charAt(0);
        if (ch1 < ch2) {
            System.out.println(ch1);
        } else {
            System.out.println(ch2);
        }
    }
}
