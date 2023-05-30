package HomeWorckOOP_01;



public class ColdDrinks extends Drinks {
    private String temperature;

    public ColdDrinks(String drinkName, double drinkPrice, double drinkVolume, String temperature) {
        super(drinkName, drinkPrice, drinkVolume);
        this.temperature = temperature;
    
    }

    @Override
    public String toString() {
        return String.format("Напиток: %s, Температура: %s", super.toString(), temperature);
    }
}
