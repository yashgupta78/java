/* To create a array 
Case1: create array using declare and initialization statement
Case2: create an array using without initialization
Case3: create an array using new and initialization */




public class program1 {
    
    //create any array to store 10 20 and 30
    //print data

    public static void main(String[] args){
        //create and initialize the array

        int[] a = {10,20,30};

        //print array reference
        System.out.println(a);
        //use loop 
        //initialize  ----> index
        //condition to stop --> if index = length then i need to stop
                                            // if index < length continue
        
        System.out.println(a.length + "length of array");
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);

        for(int index = 0 ; index < a.length; index++){
            System.out.println(a[index]);
        }

    }
}
