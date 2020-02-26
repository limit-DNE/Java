package CreateZoo.Birds;

import CreateZoo.AddAnimalToZoo;
import CreateZoo.Animal;
import CreateZoo.AnimalSurvivalNeeds;
import CreateZoo.Bird;

public class Penguin  extends Animal implements AnimalSurvivalNeeds, Bird {

    private String habitat;
    private String reproductionType;
    private boolean canFly;
    private int foodLevel;
    private int sleepLevel;
    private boolean isAddedToZoo;

    public Penguin(String name) {
        super(name);
        setHabitat("South Pole");
        setCanFly(false);
        setAddedToZoo(false);
        setReproductionType(REPRODUCTION_TYPE);
        setFoodLevel(MAX_FOOD);
        setSleepLevel(MAX_SLEEP);
    }

    @Override
    protected void getAnimalInfo() {
        print("Name " + getName() + "\nHabitat: " + getHabitat() + "\nReproduction Type: " + getReproductionType());
    }

    @Override
    protected void print(String text) {
        System.out.println(text);
    }

    @Override
    protected String getReproductionType() {
        return reproductionType;
    }

    @Override
    protected String getHabitat() {
        return habitat;
    }

    @Override
    protected void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    @Override
    protected void setReproductionType(String reproductionType) {
        this.reproductionType = reproductionType;
    }

    @Override
    public void addToZoo(Object animal) {
        AddAnimalToZoo.addAnimal(animal);
        setAddedToZoo(true);
    }

    @Override
    public boolean isAddedToZoo() {
        return isAddedToZoo;
    }

    @Override
    public boolean hasFood() {
        if (getFoodLevel() > FOOD_MINIMUM){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean hasSleep() {
        if (getSleepLevel() > SLEEP_MINIMUM){
            return true;
        } else {
            return false;
        }
    }

    private void setAddedToZoo(boolean isAddedToZoo){
        this.isAddedToZoo = isAddedToZoo;
    }

    @Override
    public void useSleep(int sleepUsed) {
        setSleepLevel(getSleepLevel() - sleepUsed);
    }

    @Override
    public void useFood(int foodUsed) {
        setFoodLevel(getFoodLevel() - foodUsed);
    }

    @Override
    public void eat() {
        if (getFoodLevel() < MAX_FOOD){
            setFoodLevel(MAX_FOOD);
            print(getName() + " just ate some food and has a full belly now!");
        } else if (getFoodLevel() == MAX_FOOD){
            print(getName() + " just ate some food. It cannot eat again. Try performing an activity first.");
        }
    }

    @Override
    public void sleep() {
        if (getSleepLevel() < MAX_SLEEP ){
            setSleepLevel(MAX_SLEEP);
            print("Good morning " +  getName() + "! you are now full on sleep.");
        } else if (getSleepLevel() == MAX_SLEEP){
            print(getName() + " just woke up! Try performing an activity first.");
        }
    }

    @Override
    public int getFoodLevel() {
        return foodLevel;
    }

    private void setFoodLevel(int foodLevel){
        this.foodLevel = foodLevel;
    }

    private void setSleepLevel(int sleepLevel){
        this.sleepLevel = sleepLevel;
    }

    @Override
    public int getSleepLevel() {
        return sleepLevel;
    }

    @Override
    public void reproduce() {
        if (isAddedToZoo()){
            if (AddAnimalToZoo.getNumberOfAnimals(this) > 1 && hasFood() && hasSleep()){
                useFood(20);
                useSleep(25);
                print(getName() + " has successfully reproduced with a mate.");
            } else if (AddAnimalToZoo.getNumberOfAnimals(this) > 1 && (!hasSleep() || !hasFood())){
                print(getName() + " needs to sleep or eat first.");
            } else if (AddAnimalToZoo.getNumberOfAnimals(this) <= 1){
                print(getName() + " needs a mate to reproduce. Please add another Penguin to the zoo first.");
            }
        } else {
            print(getName() + " needs to be added to the zoo to find a mate to reproduce!");
        }
    }

    @Override
    public void socialize() {
        if (isAddedToZoo()){
            if (AddAnimalToZoo.getNumberOfAnimals(this) > 1 && hasSleep() && hasFood()){
                useFood(20);
                useSleep(15);
                print(getName() + " is now socializing with other Penguins.");
            } else if (AddAnimalToZoo.getNumberOfAnimals(this) > 1 && (!hasSleep() || !hasFood())){
                print(getName() + " needs to sleep or eat first.");
            } else if (AddAnimalToZoo.getNumberOfAnimals(this) <= 1){
                print(getName() + " needs some friends to socialize. Please add more Penguins to the zoo first.");
            }
        } else {
            print(getName() + " needs to be added to the zoo to find friends!");
        }
    }

    @Override
    public void fly() {
        if (hasFood() && hasSleep() && canFly()){
            useSleep(20);
            useFood(15);
            print(getName() + " is now flying!");
        } else if ((!hasFood() || !hasSleep()) && canFly()){
            print(getName() + " needs to sleep or eat first.");
        } else if (!canFly()){
            print(getName() + " is not the type of bird that can fly.");
        }
    }

    @Override
    public boolean canFly() {
        return canFly;
    }

    private void setCanFly(boolean canFly){
        this.canFly = canFly;
    }
}
