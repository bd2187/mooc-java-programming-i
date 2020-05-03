
public class PaymentCard {
    private double balance;
    
    public PaymentCard(double balance) {
        this.balance = balance;
    }
    
    public String toString() {
        return "The card has a balance of " + this.balance + " euros";
    }
    
    public void eatAffordably() {
        
        double newBalance = this.balance - 2.60;
        
        if(newBalance >= 0) {
            this.balance = newBalance;
        }                
    }
    
    public void eatHeartily() {        
        double newBalance = this.balance - 4.60;
        
        if(newBalance >= 0) {
            this.balance -= 4.60;        
        }        
    }
    
    public void addMoney(double amount) {
        
        if(amount >= 0){                    
            double newAmount = this.balance + amount;
            if(newAmount >= 150.0) {
                this.balance = 150.0;
            } else {
                this.balance = newAmount;
            }
        }
        
    }
}
