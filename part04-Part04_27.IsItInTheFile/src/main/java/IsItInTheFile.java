import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Name of the file:");
        String fileName = scanner.nextLine();
        
        System.out.println("Search for:");
        String query = scanner.nextLine();
        
        try(Scanner fileReader = new Scanner(Paths.get(fileName))) {
            
            Boolean found = false;
            while(fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                if(line.contains(query)) {
                    found = true;
                    break;
                }
            }
            
            if(found) {
                System.out.println("Found!");
            } else {
                System.out.println("Not found.");
            }
            
        } catch(Exception err) {
            System.out.println("Reading the file " + fileName + " failed.");
        }
        
    }
}