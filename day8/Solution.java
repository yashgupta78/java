
import java.util.*;
import java.util.Scanner;

public class Solution{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if(n%2 == 1)
            System.out.println("Wired");
        else if(n>=2 && n<=5)
            System.out.println("not wired");
        else if(n>=6 && n<=20)
            System.out.println("wired");
        else
            System.out.println("not wired");
    }
}
