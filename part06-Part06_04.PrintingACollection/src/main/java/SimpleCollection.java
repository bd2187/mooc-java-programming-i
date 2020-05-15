
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    @Override
    public String toString() {
        if(this.elements.isEmpty()) {
            return "The collection " + name + " is empty.";
        } else {
            
            int amount = this.elements.size();
            String elementsStr = "";
            if(amount > 1) {
                elementsStr = "elements";
            } else {
                elementsStr = "element";
            }
            
            String value = "The colletion " +  name + " has " + amount + " " + elementsStr + ": \n";
            
            
            for(String letter: this.elements) {
                value += letter + "\n";
            }
            
            return value;
            
        }
    }
    
}
