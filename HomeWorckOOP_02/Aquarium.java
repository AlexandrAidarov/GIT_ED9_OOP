package HomeWorckOOP_02;

import java.util.ArrayList;
import java.util.List;

public class Aquarium {
    
    private final List<Fish> aquarium = new ArrayList<>();

    public Aquarium addFish(Fish someFish) {
        aquarium.add(someFish);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        
        for (Fish fish : aquarium) {
            builder.append(fish).append("\n");
        }
        return builder.toString();
    }

    private List<SpeedAble> getSpeedAble() {
        List<SpeedAble> result = new ArrayList<>();
        for (Fish fish : aquarium) {
            result.add(fish);
        }
        return result;
    }
    public String getSpeed() {
        StringBuilder builder = new StringBuilder();
        for (SpeedAble speedAble : getSpeedAble()) {
            builder.append(speedAble.speed()).append('\n');
        }
        return builder.toString();
    }

    /*
    private List<AquaSoundAble> getAquaSoundable() {
        List<AquaSoundAble> result = new ArrayList<>(aquarium);
        result.add(water);
        return result;
    }

    public String getAquaSound() {
        StringBuilder builder = new StringBuilder();
        for (AquaSoundAble soundable : getAquaSoundable()) {
            builder.append(soundable.sound()).append('\n');
        }
        return builder.toString();
    }

    public List<EatingFish> ateFishes() {
        List<EatingFish> fishEaters = new ArrayList<>();
        for (AquaResidents fishers : aquarium) {
            if (fishers instanceof EatingFish) {
                fishEaters.add((EatingFish) fishers);
            }
        }
        fishEaters.add(joe);
        return fishEaters;
    }

    public List<HitingSuperCombo> heroes() {
        List<HitingSuperCombo> superHeroes = new ArrayList<>();
        for (AquaResidents hero : aquarium) {
            if (hero instanceof HitingSuperCombo) {
                superHeroes.add((HitingSuperCombo) hero);
            }
        }
        superHeroes.add(joe);
        superHeroes.add(bob);
        return superHeroes;
    }

    public HitingSuperCombo getSuperChamp(List<HitingSuperCombo> supers) {
        HitingSuperCombo superSuper = supers.get(0);
        for (HitingSuperCombo isSuper : supers) {
            if (isSuper.getComboStrength() > superSuper.getComboStrength()) {
                superSuper = isSuper;
            }
        }
        return superSuper;
    }

    public EatingFish getMainGuzzler(List<EatingFish> eaters) {
        EatingFish mainEater = eaters.get(0);
        for (EatingFish eater : eaters) {
            if (eater.eatedFishes() > mainEater.eatedFishes()) {
                mainEater = eater;
            }
        }
        return mainEater;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("\n *** Let's look, who is there in our aquarium: *** \n");
        for (AquaResidents residents : aquarium) {
            builder.append(residents).append("\n");
        }
        return builder.toString();
    }*/
}