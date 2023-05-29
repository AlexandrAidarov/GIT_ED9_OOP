package HomeWorckOOP_01;




public class Main {
    public static void main(String[] args) {

        CoffeMachine apparat = new CoffeMachine();
        apparat.addProduct(new Coffe("Alpen gold", 10, "темный",
                        "с орехом", 100))
                .addProduct(new Coffe("яблоко", 30))
                .addProduct(new Coffe("Кола", 15))
                .addProduct(new Coffe("Российский", 10, "вкусный", 1000));

        System.out.println(apparat);
        Product product = apparat.findProduct("яблоко");
        System.out.println(product);

        System.out.println("+++++++++++++++++++++");
        Product saledProduct = apparat.saleProduct("яблоко");
        System.out.println(saledProduct);
        Product saledProduct2 = apparat.saleProduct("Кола");
        System.out.println(saledProduct2);
        System.out.println(apparat);

    }
}