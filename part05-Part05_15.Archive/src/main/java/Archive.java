
public class Archive {
    private String identifier;
    private String name;
    
    public Archive(String identifier, String name) {
        this.identifier = identifier;
        this.name = name;
    }
    
    @Override
    public String toString() {
        return this.identifier + ": " + this.name;
    }
    
    @Override
    public boolean equals(Object compared) {
        System.out.println("run");
        if(this == compared) {
            return true;
        }
        
        if(!(compared instanceof Archive)) {
            return false;
        }
        
        Archive comparedItem = (Archive) compared;
        
        return comparedItem.identifier.equals(this.identifier);
                
    }
}
