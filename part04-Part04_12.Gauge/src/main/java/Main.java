
public class Main {

    public static void main(String[] args) {
        Gauge g = new Gauge();
        
        g.increase();
        System.out.println(g.value());
        
        g.decrease();
        System.out.println(g.value());
        g.decrease();
        System.out.println(g.value());
    }
}
