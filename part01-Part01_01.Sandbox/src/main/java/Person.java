public class Person {
    private String name;
    private int age;
    
    public Person(String initialName) {
        this.age = 0;
        this.name = initialName;
    }
    
    public void printInfo() {
        System.out.println(this.name + " is " + this.age + " years old.");
    }
    
    public void updateAge(int age) {
        this.age = age;
    }
}