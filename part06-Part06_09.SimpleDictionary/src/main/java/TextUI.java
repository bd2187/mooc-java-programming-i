import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary simpleDictionary;
    
    public TextUI (Scanner scanner, SimpleDictionary simpleDictionary){
        this.scanner = scanner;
        this.simpleDictionary = simpleDictionary;
    }
    
    public void start() {
        
        while(true) {
            System.out.print("Command:");
            String command = this.scanner.nextLine();
            
            if(command.equals("end")) {
                
                System.out.println("Bye bye!");
                return;
                
            } else if(command.equals("add")) {
                
                System.out.print("Word: ");
                String word = this.scanner.nextLine();
                System.out.print("Translation: ");
                String translation = this.scanner.nextLine();
                this.simpleDictionary.add(word, translation);
                continue;
                
            } else if(command.equals("search")) {
                
                System.out.print("To be translated: ");
                String toBeTranslated = this.scanner.nextLine();
                String translation = this.simpleDictionary.translate(toBeTranslated);    
                if(translation == null) {
                    
                    System.out.println("Word " + toBeTranslated + " was not found");                    
                    
                } else {                    
                    
                    System.out.println("Translation: " + translation);                
                                    
                }
                
                continue;
                                
                
            }
            
            
            
            System.out.println("Unknown command");
        }
        
        
    }
}
