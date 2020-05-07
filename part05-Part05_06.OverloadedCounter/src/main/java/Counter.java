public class Counter {
    private int value;
    
    
    public Counter() {
        this(0);
    }
    
    public Counter(int startValue) {
        this.value = startValue;
    
    }
    
    public void increase(int num) {
        if(num > 0) {
            this.value += num;    
        }
        
    }
    
    public void increase() {
        ++this.value;
    }
    
    public void decrease(int num) {
        if(num > 0) {
            this.value -= num;    
        }
        
    }
    
    public void decrease() {
        --this.value;
    }
    
    public int value() {
        return this.value;
    }
}
