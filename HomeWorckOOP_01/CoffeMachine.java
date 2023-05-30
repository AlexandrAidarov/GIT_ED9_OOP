package HomeWorckOOP_01;

import java.util.ArrayList;
import java.util.List;

public class CoffeMachine {
    private List<Drinks> vending = new ArrayList<>();
    private double cash = 0;

    public CoffeMachine addDrink(Drinks drink){
        vending.add(drink);
        return this;
    }

    public List<Drinks> getVending() {
        return vending;
    }

    public Drinks findDrink(String name){
        for (Drinks product:vending) {
            if (name.equals(product.getDrinkName())){
                return product;
            }
        }
        return null;
    }

    public double getCash() {
        return cash;
    }

    public Drinks saleProduct(String nameOfDrink){
        Drinks founded = findDrink(nameOfDrink);
        if (founded != null){
            cash = cash + founded.getDrinkPrice();
            vending.remove(founded);
        }
        return founded;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Денег в автомате: ").append(cash).append("\n");
        for (Drinks drink:vending) {
            builder.append(drink).append("\n");
        }
        return builder.toString();
    }
}

