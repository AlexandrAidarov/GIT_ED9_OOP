package HomeWorckOOP_01;

public class Drinks {
    private String drinkName;
    private double drinkPrice;
    private double drinkVolume;

    public Drinks(String drinkName, double drinkPrice, double drinkVolume) {
        this.drinkName = drinkName;
        this.drinkPrice = drinkPrice;
        this.drinkVolume = drinkVolume;
    }

    @Override
    public String toString() {
        return String.format("Напиток: %s, Цена: %f, Объем: %f",
         drinkName, drinkPrice, drinkVolume);
    }

    public String getDrinkName() {
        return drinkName;
    }

    public double getDrinkPrice() {
        return drinkPrice;
    }
    public double getDrinkVolume() {
        return drinkVolume;
    } 
}

