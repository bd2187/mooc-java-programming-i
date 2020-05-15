import java.util.ArrayList;

public class Stack {
    public ArrayList<String> myStrings;
    
    public Stack() {
        this.myStrings = new ArrayList<> ();
    }
    
    public boolean isEmpty() {
        if(this.myStrings.size() == 0) {
            return true;
        } else {
            return false;
        }
    }
    
    public void add(String value) {
        this.myStrings.add(0, value);        
    }
    
    public String take() {
        String val =  this.myStrings.get(0);
        this.myStrings.remove(0);
        return val;
    }
    
    public ArrayList<String> values() {
        return this.myStrings;
    }       
}
 