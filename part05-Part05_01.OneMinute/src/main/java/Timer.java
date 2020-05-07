
public class Timer {
    private ClockHand hundredths;
    private ClockHand seconds;
    
    public Timer() {
        this.hundredths = new ClockHand(100);
        this.seconds = new ClockHand(0);
    }
    
    public void advance() {
        this.hundredths.advance();
        
        if(this.hundredths.value() == 0) {
            this.seconds.advance();
        }
    }
}
