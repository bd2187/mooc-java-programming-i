import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("File?");
        String fileName = scanner.nextLine();
        
        System.out.println("Lower bound?");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.println("Upper bound?");
        int upperBound = Integer.valueOf(scanner.nextLine());
        
        int count = 0;
        try(Scanner fileReader = new Scanner(Paths.get(fileName))) {
            
            while(fileReader.hasNextLine()) {
               int number = Integer.valueOf(fileReader.nextLine());
               
               if(number >= lowerBound && number <= upperBound) {
                   count++;
               }
            }
            
        } catch(Exception err) {
            
        }
        
        System.out.println("Numbers: " + count);
    }
}