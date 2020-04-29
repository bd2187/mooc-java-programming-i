public class ArrayPrinter {
    public static void main(String[] args) {
        int[] array = {5, 1, 3, 4, 2};
        printNeatly(array);
        
    }
    
    public static void printNeatly(int[] array) {
        
        String commaSeparatedList = "";
        for(int i = 0; i < array.length; i++) {
            
            if(i == (array.length - 1)) {
                commaSeparatedList += array[i];
            } else {
                commaSeparatedList += array[i] + ", ";
            }
        }
        
        System.out.println(commaSeparatedList);
    }
}


