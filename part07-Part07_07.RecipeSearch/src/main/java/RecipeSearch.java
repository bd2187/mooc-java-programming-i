
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.nio.file.Paths;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        
        System.out.println("File to read: ");
        String fileName = scanner.nextLine();
        
        System.out.println("Commands:");
        System.out.println("list - lists the receipe");
        System.out.println("stop - stops the program");
        
        Boolean askUser = true;
        
        while(askUser) {
            
            System.out.print("Enter command: ");
            String command = scanner.nextLine();   
            if(command.equals("stop")) {
                break;
            }
            
            int counter = 0;
            String recipeToPrint = "";
            try(Scanner file = new Scanner(Paths.get(fileName))) {
            
                while(file.hasNextLine()) {
                    
                    String line = file.nextLine();
                    if(line.trim().equals("")) {
                        
                        System.out.println(recipeToPrint);
                        counter = 0;
                        recipeToPrint = "";                        
                    } else {
                        
                        if(counter == 0) {
                            recipeToPrint += line + ", ";
                        } else if(counter == 1) {
                            
                            recipeToPrint += "cooking time: " + line;
                        }
                        counter++;                                               
                    }
                    
                    
                    
                }

                
            } catch(Exception e) {
                System.out.println("error");
                System.out.println(e);
            }                     
        }




        
        
    }

}
