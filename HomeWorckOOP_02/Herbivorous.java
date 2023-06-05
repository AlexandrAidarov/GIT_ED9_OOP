package HomeWorckOOP_02;

public abstract class Herbivorous extends Fish implements SpeedAble {

    private String feedingType;

    public Herbivorous(String type, String name, double speed, String feedingType) {
        super(type, name, speed);
        this.feedingType = feedingType;
    
    }

    @Override
    public String toString() {
        return String.format("Feeding Type: %s", super.toString(), feedingType);
    }
    public String getFeedingType() {
        return "plankton";
    }
}