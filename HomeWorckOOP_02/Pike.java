package HomeWorckOOP_02;

public class Pike extends Predators {

    /*public Pike (String name) {
        super name;
    }*/

    public Pike(String type, String name, double speed, String feedingType) {
        super(type, name, speed);
        
    }

    @Override
    public String toString() {
        return String.format("Waterfowl: %s", super.toString());
    }


}
