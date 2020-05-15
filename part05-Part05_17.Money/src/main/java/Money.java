
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }
    
    public Money plus(Money addition) {
          int newEuros = this.euros() + addition.euros();
          int newCents = this.cents() + addition.cents();
        
        Money newMoney = new Money(newEuros, newCents);               
        
        return newMoney;
    }
    
    public Money minus(Money decreaser) {
        
         double aMoney = (double) this.euros() + (this.cents() / 100);
         double bMoney = (double) decreaser.euros() + (decreaser.cents() / 100);
         
         
         double cMoney = aMoney - bMoney;
         
         String[] arr = String.valueOf(cMoney).split("\\.");
         
         int firstInt = Integer.parseInt(arr[0]);
         int secondInt = Integer.parseInt(arr[1]);


       Money newMoney = new Money(firstInt, secondInt);
       
       return newMoney;
    }
    
    public boolean lessThan(Money compared) {
        if(this.euros() < compared.euros()) {
            return true;
        }
        
        if(this.euros() == compared.euros() && this.cents() < compared.cents()) {
            return true;
        }
        
        return false;
    }    
    

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
