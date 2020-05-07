public class Person {
    private String name;
    private int age;
    
    public Person(String initialName) {
        this.age = 0;
        this.name = initialName;
    }
 
    public String toString() {
        return this.name + " is " + this.age + " years old.";
    }
    
    
    public int updateAge() {
        this.age += 1;
        
        return age;
    }
    
    public String getName() {
        return this.name;
    }
}