package Seminar4_OOP.shield;

public class LightShield implements Shields {
    @Override
    public int resistance() {
        return 2;
    }
    @Override
    public String toString() {
        return String.format("LightShield : %d ", resistance());
    }
    
}
