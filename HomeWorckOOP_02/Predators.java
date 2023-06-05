package HomeWorckOOP_02;

public abstract class Predators extends Fish {

    private String feedingType;

    public Predators(String type, String name, double speed ) {
        super(type, name, speed);
        //this.feedingType = feedingType;
    
    }
    public String feedingType() {
        return "fish";
    }
    @Override
    public String toString() {
        return String.format( super.toString(), feedingType);
    }

}
