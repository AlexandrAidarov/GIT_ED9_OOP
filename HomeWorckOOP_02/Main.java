package HomeWorckOOP_02;



public class Main {

    public static void main(String[] args) {

        
        Pike pike = new Pike ("Pike", "Lion", 9.2, "fish");
        Kambala kambala = new Kambala("Kambala", "Mike", 5.8, "gras");
        Snail snail = new Snail("Snail", "Ed", 0.2, "Plankton");

        Aquarium aqua = new Aquarium();
        aqua.addFish(pike).addFish(kambala).addFish(snail);

        System.out.println(aqua);
        /*System.out.println("\n *** And now be quiet to listen the sounds оf aquarium: *** ");
        System.out.println(aqua.getAquaSound());


        System.out.println("\n *** Fishguzzlers: *** ");
        for (EatingFish fishers : aqua.ateFishes()) {
            System.out.println(fishers);
        }

        System.out.println("\n *** A-a-and ... our Main Guzzler is ... /drum roll/: ... *** ");
        System.out.println(aqua.getMainGuzzler(aqua.ateFishes()));
        System.out.println(String.format(" He ate %d fishes!", aqua.getMainGuzzler(aqua.ateFishes()).eatedFishes()));

        System.out.println("\n *** This are our Heroes: *** ");
        for (HitingSuperCombo hero : aqua.heroes()) {
            System.out.println(hero.hitingSuperCombo());
        }

        System.out.println("\n *** And the most Heroic Hero is ... /drum roll/: ... ***");
        System.out.print(aqua.getSuperChamp(aqua.heroes()));
        System.out.println(String.format(" Strength of his combo is: %d."
                , aqua.getSuperChamp(aqua.heroes()).getComboStrength()));

    }*/

    }
}
