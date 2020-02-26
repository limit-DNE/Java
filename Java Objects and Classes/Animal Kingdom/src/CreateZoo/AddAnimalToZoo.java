package CreateZoo;

import java.util.ArrayList;

public class AddAnimalToZoo {

    private static ArrayList<Object> animals = new ArrayList<>();

    public static void addAnimal(Object animal){
        if (isNotAdded(animal)){
            animals.add(animal);
        }
    }

    public static boolean isNotAdded(Object checkAnimal){
        boolean doesNotExist = true;
        for (Object animal : animals) {
            if (checkAnimal.equals(animal)){
                doesNotExist = false;
            }
        }
        return doesNotExist;
    }

    public static int getNumberOfAnimals(Object specie){
        int numberOfAnimals = 0;
        if (animals.size() > 0){
            for (Object animal : animals) {
                if (animal.getClass().isInstance(specie)){
                    numberOfAnimals++;
                }
            }
        }
        return numberOfAnimals;
    }

    public static boolean animalIsAtZoo(Object checkAnimal){
        boolean isAdded = false;
        if (animals.size() > 0){
            for (Object animal : animals) {
                if (animal.getClass().isInstance(checkAnimal)){
                    isAdded = true;
                }
            }
        }
        return isAdded;
    }
}
