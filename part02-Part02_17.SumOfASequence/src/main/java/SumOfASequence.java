/*
    Implement a program, which calculates the sum 1+2+3+...+n where n is given as user input.
*/
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Last number?");
        int num = Integer.valueOf(scanner.nextLine());
        
        int sum = 0;
        for(int i = 1; i <= num; i++) {
            sum += i;
        }
        
        System.out.println(sum);
    }
}
