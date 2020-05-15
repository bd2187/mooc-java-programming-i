import java.util.ArrayList;

public class Package {
    private ArrayList<Gift> packages;
    
    public Package() {
        this.packages = new ArrayList<> ();
    }
    
    public void addGift(Gift gift) {
        this.packages.add(gift);
    }
    
    public int totalWeight() {
        int count = 0;
        for(Gift gift: this.packages ){
            count += gift.getWeight();
        }
        
        return count;
    }
}
