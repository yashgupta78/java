//read size from the user  
//create int[] for the user provided size
//initialize data bey reading it from the user
//print all the data present in the array

import java.util.Scanner;
public class program2 {
    
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        //read size
        System.out.println("Enter the size of the array: ");
        int size = s.nextInt();
        //creating array object
        int[] a = new int[size];
        //read elements 
        for (int index = 0; index < a.length; index++){
            a[index] = s.nextInt();
        }
        //print array elements
        for(int index = 0; index < a.length; index++){
            System.out.print(a[index] + ",");
        }
        //a[4] = 20; complie time Sucess
        //expection ---> ArrayIndexOutOfBoundsException
    }
}
