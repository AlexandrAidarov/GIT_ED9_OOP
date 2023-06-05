package HomeWorckOOP_02;

public abstract class Fish {
    private String type;
    private String name;
    private double speed;

    public Fish(String type, String name, double speed) {
        this.type = type;
        this.name = name;
        this.speed = speed;
    }
    @Override
    public String toString() {
        return String.format("Type: %s, Name: %s, Speed: %f",
         type, name, speed);
    }

    
    public String getType() {
        return type;
    }
    public double getSpeed() {
        return speed;
    }


}