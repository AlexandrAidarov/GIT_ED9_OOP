package Seminar4_OOP.shield;

public class HavyShield implements Shields {
    
    @Override
    public int resistance() {
        return 5;
    }
    @Override
    public String toString() {
        return String.format("HavyShield : %d ", resistance());
    }
    
}
