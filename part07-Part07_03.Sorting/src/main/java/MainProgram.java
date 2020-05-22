import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        int[] numbers = { 6, 3, 0, -1, 4 };
        int res = MainProgram.indexOfSmallest(numbers);
        
        System.out.println(res);               
    }
    
    public static int smallest(int[] array){
        
        int smallestNum = array[0];
        
        for(int i = 1; i < array.length; i++) {
            if(array[i] <= smallestNum) {
                smallestNum = array[i];
            }
        }
        
        return smallestNum;
    }
    
    public static int indexOfSmallest(int[] array) {
        int smallestNumber = array[0];
        int indexOfSmallest = 0;
        
        for(int i = 0; i < array.length; i++) {
            if(array[i] <= smallestNumber) {
                indexOfSmallest = i;
                smallestNumber = array[i];
            }
        }
        
        return indexOfSmallest;
    }
    
    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        
        int smallestNumber = table[startIndex];
        int indexOfSmallest = startIndex;
 
        for(int i = startIndex; i < table.length; i++) {

            if(table[i] <= smallestNumber) {
                indexOfSmallest = i;
                smallestNumber = table[i];
            }
        }      
        
        return indexOfSmallest;
        
    }

    public static void swap(int[] array, int index1, int index2) {
        
        int placeholder = array[index2];
        
        array[index2] = array[index1];        
        array[index1] = placeholder;
    }
    
    public static void sort(int[] array) {        
        for(int i = 0; i < array.length; i++) {
            int indexOfSmallestNum = indexOfSmallestFrom(array, i);
            swap(array, i, indexOfSmallestNum);            
            System.out.println(Arrays.toString(array));
        }               
    }

}
