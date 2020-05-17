import java.util.ArrayList;

public class TodoList {
    
    private ArrayList<String> list;
    
    public TodoList() {
        this.list = new ArrayList<>();               
    }
    
    public void add(String task) {
        this.list.add(task);
    }
    
    public void print() {
        for(int i = 0; i < this.list.size(); i++) {
            int num = i + 1;
            
            System.out.println(num + ": " + this.list.get(i));            
        }
    }
    
    public void remove(int number) {
        this.list.remove(number - 1);
    }
}
