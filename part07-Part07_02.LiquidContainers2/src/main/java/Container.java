public class Container {
    
    private int amount;
    public Container() {
        this.amount = 0;
    }
    
    public int contains() {
        return this.amount;
    }
    
    public void add(int amount) {
        if(amount >= 0) {
            
            int newAmount = this.amount + amount;
            
            if(newAmount <= 100) {
                this.amount = newAmount;
            } else {
                this.amount = 100;
            }                        
        }
    }
    
    public void remove(int amount) {
        if(amount >= 0) {
            int newAmount = this.amount - amount;
            
            if(newAmount < 0) {
                this.amount = 0;
                
            } else if(newAmount >= 0) {
                
                this.amount = newAmount;
            }
        }
    }
    
    @Override
    public String toString() {
        return this.contains() + "/100";
    }
}
