import java.util.ArrayList;

public class Suitcase {
    private int maximumWeight;
    private ArrayList<Item> items;
    
    public Suitcase(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        this.items = new ArrayList<> ();
    }
    
    public int totalWeight() {
        int totalWeight = 0;
        for(Item item: this.items) {
            totalWeight += item.getWeight();
        }        

        return totalWeight;
    }   
    
    public void addItem(Item item) {
        
        if(this.totalWeight() + item.getWeight() > this.maximumWeight) {
            return;
        } else {
            this.items.add(item);    
        }
        
    }
    
    public void printGoods() {
        for(Item item: this.items ) {
            System.out.println(item);
        }
    }
    
    public Item heaviestItem() {
        
        if(this.items.isEmpty()) {
            return null;
        }
        
        Item heaviestItem = this.items.get(0);
        
        for(Item item: this.items) {
            if(item.getWeight() > heaviestItem.getWeight()) {
                heaviestItem = item;
            }
        }
        
        return heaviestItem;
    }
    
    @Override
    public String toString() {
        int itemsAmount = this.items.size();

        String itemsStr = "item";
        if(itemsAmount == 1) {
            itemsStr = "item";
        }
        
        return itemsAmount + " " + itemsStr + " (" + this.totalWeight() + " kg)";
    }
    
}
