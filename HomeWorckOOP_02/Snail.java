package HomeWorckOOP_02;

public class Snail extends Herbivorous {
    public Snail(String type, String name, double speed, String feedingType) {
        super(type, name, speed, feedingType);
        
    }

    @Override
    public String toString() {
        return String.format("Waterfowl: %s", super.toString());
    }
}
