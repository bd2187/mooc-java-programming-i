
public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }
    
    public boolean largerThan(Apartment compared) {
        if(this.squares > compared.squares) {
            return true;
        } else {
            return false;
        }
    }
    
    public int priceDifference(Apartment compared) {
        
        int priceOfApartment = this.squares * this.pricePerSquare;
        int priceOfCompared = compared.squares * compared.pricePerSquare;
        
        int diff_1 = priceOfApartment - priceOfCompared;
        
        if(diff_1 >= 0) {
            return diff_1;
        } else {
            return priceOfCompared - priceOfApartment;
        }               
    }
    
    public boolean moreExpensiveThan(Apartment compared) {
        int priceOfApartment = this.squares * this.pricePerSquare;
        int priceOfCompared = compared.squares * compared.pricePerSquare;

        if(priceOfCompared < priceOfApartment) {
            return true;
        } else {
            return false;
        }
    }

}
