
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int first = 0;
        int second = 0;

        while (true) {
            
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            
            String[] inputArr = input.split(" ");
            String command = inputArr[0];
            int amount = Integer.valueOf(inputArr[1]);
            
            if(command.equals("add") && amount > 0) {
                
                first += amount;
                
                if(first >= 100) {
                    first = 100;
                }
                
            } else if(command.equals("move") && amount > 0) {
                                
                if(first >= amount) {
                    
                    first -= amount;
                    
                    if(first <= 0) {
                        first = 0;
                    }                

                    second += amount;                
                } else {
                    
                    int diff = amount - first;
                    
                    second += amount - diff;
                    first = 0;
                }
                
                if(second >= 100) {
                    second = 100;
                }
                
            } else if(command.equals("remove") && amount > 0) {                                
                
                second -= amount;

                if(second <= 0) {
                    second = 0;
                }
                

            }                       

        }
    }

}

//With input
//add 30
//move 40
//quit
//
//Output should contain:
//Second: 30/100
//Output was:
//First: 0/100
//Second: 0/100
//First: 30/100
//Second: 0/100
//First: 30/100
//Second: 0/100