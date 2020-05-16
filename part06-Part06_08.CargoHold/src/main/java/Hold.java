import java.util.ArrayList;

public class Hold {
    private int maximumWeight;
    private ArrayList<Suitcase> suitCases;
    
    public int totalWeight() {
        int totalWeight = 0;
        
        for(Suitcase suitcase: this.suitCases ) {
            totalWeight += suitcase.totalWeight();
        }
        
        return totalWeight;
    }
    
    public Hold(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        this.suitCases = new ArrayList<> ();
    }
    
    public void addSuitCase(Suitcase suitcase) {
        
        if(this.totalWeight() + suitcase.totalWeight() > this.maximumWeight) {
            return;
        } else {
            this.suitCases.add(suitcase);
        }        
    }
    
    public void printItems() {
        for(Suitcase suitcase: this.suitCases) {
            suitcase.printGoods();
        }
    }
    
    @Override
    public String toString() {
        return this.suitCases.size() + " suitcases " + "(" + this.totalWeight() + " kg)";
    }
    
    
}
