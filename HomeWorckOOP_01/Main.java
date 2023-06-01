package HomeWorckOOP_01;




public class Main {
    public static void main(String[] args) {

        CoffeMachine apparat = new CoffeMachine();
        apparat.addDrink(new Drinks("капучино", 70, 0.3))
                .addDrink(new Drinks("латте", 80, 0.3))
                .addDrink(new ColdDrinks("минералка", 45, 0.5, "охлажденный"))
                .addDrink(new ColdDrinks("колла", 60, 0.5, "охлажденный"));

        System.out.println(apparat);


        System.out.println("----------------------");
        System.out.println("Продажа напитка:");
        Drinks saledProduct = apparat.saleProduct("капучино");
        System.out.println(saledProduct);
        
        System.out.println(apparat);

    }
}