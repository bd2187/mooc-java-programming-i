
public class Greatest {

    public static int greatest(int number1, int number2, int number3) {
        //write some code here

        int greatestFromFirstSet;
        
        if(number1 > number2) {
            greatestFromFirstSet = number1;
        } else {
            greatestFromFirstSet = number2;
        }
        
        if(greatestFromFirstSet > number3) {
            return greatestFromFirstSet;
        } else {
            return number3;
        }
        
        
    }

    public static void main(String[] args) {
        int result = greatest(2, 7, 3);
        System.out.println("Greatest: " + result);
    }
}
