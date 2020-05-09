
public class PaymentCard {

    private double balance;

    public PaymentCard(double balance) {
        this.balance = balance;
    }

    public double balance() {
        return this.balance;
    }

    public void addMoney(double increase) {
        this.balance += increase;
    }

    public boolean takeMoney(double amount) {

        double difference = this.balance - amount;
        
        if(difference >= 0) {
            this.balance = difference;
            return true;
        } else {
            return false;    
        }
        
    }
}
