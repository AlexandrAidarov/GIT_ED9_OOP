package HomeWorckOOP_01;




public class Main {
    public static void main(String[] args) {

        CoffeMachine apparat = new CoffeMachine();
        apparat.addDrink(new Drinks("капучино", 70, 0.3))
                .addDrink(new Drinks("латте", 80, 0.3))
                .addDrink(new ColdDrinks("минералка", 45, 0.5, "охлажденный"))
                .addDrink(new ColdDrinks("колла", 60, 0.5, "охлажденный"));

        System.out.println(apparat);
        Drinks drink = apparat.findDrink("капучино");
        System.out.println(drink);

        System.out.println("+++++++++++++++++++++");
        Drinks saledProduct = apparat.saleProduct("капучино");
        System.out.println(saledProduct);
        Drinks saledProduct2 = apparat.saleProduct("Колла");
        System.out.println(saledProduct2);
        System.out.println(apparat);

    }
}