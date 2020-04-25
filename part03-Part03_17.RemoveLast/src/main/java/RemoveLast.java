
import java.util.ArrayList;

public class RemoveLast {

    public static void main(String[] args) {
        
        ArrayList<String> names = new ArrayList<> ();
        
        names.add("person");
        names.add("person2");
        names.add("person3");
        removeLast(names);
    }
    
    public static void removeLast(ArrayList<String> names) {
        
        if(names.size() > 0) {
            names.remove(names.size() - 1);    
        }
        
    }

}
