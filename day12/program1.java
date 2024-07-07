public class program1 {
    public static int[] getIntArray(int size){
        //create an array;
        int[] array = new int[size];
        //return ref of array object
        return array;
    }
    public static void main(String[] args){
        int [] v1 = getIntArray(size : 5);
        System.out.println(v1);
        System.out.println(v1.length);
    }

}
