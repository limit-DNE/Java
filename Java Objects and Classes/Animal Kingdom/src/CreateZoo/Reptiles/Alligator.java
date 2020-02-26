package CreateZoo.Reptiles;

import CreateZoo.AddAnimalToZoo;
import CreateZoo.Animal;
import CreateZoo.AnimalSurvivalNeeds;
import CreateZoo.Reptile;

public class Alligator extends Animal implements AnimalSurvivalNeeds, Reptile {

    private String reproductionType;
    private String habitat;
    private int foodLevel;
    private int sleepLevel;
    private boolean isAddedToZoo;
    private boolean canWalk;
    private boolean canSwim;
    private boolean canCrawl;

    public Alligator(String name) {
        super(name);
        setHabitat(HABITAT);
        setReproductionType(REPRODUCTION_TYPE);
        setIsAddedToZoo(false);
        setFoodLevel(MAX_FOOD);
        setSleepLevel(MAX_SLEEP);
        setCanCrawl(false);
        setCanSwim(true);
        setCanWalk(true);
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
        setIsAddedToZoo(true);
    }

    @Override
    public boolean isAddedToZoo() {
        return isAddedToZoo;
    }

    private void setIsAddedToZoo(boolean isAddedToZoo){
        this.isAddedToZoo = isAddedToZoo;
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

    @Override
    public int getSleepLevel() {
        return sleepLevel;
    }

    private void setFoodLevel(int foodLevel){
        this.foodLevel = foodLevel;
    }

    private void setSleepLevel(int sleepLevel){
        this.sleepLevel = sleepLevel;
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
                print(getName() + " needs a mate to reproduce. Please add another Alligator to the zoo first.");
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
                print(getName() + " is now socializing with other Alligators.");
            } else if (AddAnimalToZoo.getNumberOfAnimals(this) > 1 && (!hasSleep() || !hasFood())){
                print(getName() + " needs to sleep or eat first.");
            } else if (AddAnimalToZoo.getNumberOfAnimals(this) <= 1){
                print(getName() + " needs some friends to socialize. Please add more Alligators to the zoo first.");
            }
        } else {
            print(getName() + " needs to be added to the zoo to find friends!");
        }
    }

    @Override
    public void crawl() {
        if (hasFood() && hasSleep() && canCrawl()){
            useSleep(20);
            useFood(15);
            print(getName() + " is now crawling!");
        } else if ((!hasFood() || !hasSleep()) && canCrawl()){
            print(getName() + " needs to sleep or eat first.");
        } else if (!canCrawl()){
            print(getName() + " is not the type of reptile that can crawl.");
        }
    }

    @Override
    public boolean canCrawl() {
        return canCrawl;
    }

    private void setCanCrawl(boolean canCrawl){
        this.canCrawl = canCrawl;
    }

    @Override
    public void swim() {
        if (hasFood() && hasSleep() && canSwim()){
            useSleep(20);
            useFood(15);
            print(getName() + " is now swimming!");
        } else if ((!hasFood() || !hasSleep()) && canSwim()){
            print(getName() + " needs to sleep or eat first.");
        } else if (!canSwim()){
            print(getName() + " is not the type of reptile that can swim.");
        }
    }

    private void setCanSwim(boolean canSwim){
        this.canSwim = canSwim;
    }

    @Override
    public boolean canSwim() {
        return canSwim;
    }

    @Override
    public void walk() {
        if (hasFood() && hasSleep() && canWalk()){
            useSleep(20);
            useFood(15);
            print(getName() + " is now walking!");
        } else if ((!hasFood() || !hasSleep()) && canWalk()){
            print(getName() + " needs to sleep or eat first.");
        } else if (!canWalk()){
            print(getName() + " is not the type of reptile that can walk.");
        }
    }

    @Override
    public boolean canWalk() {
        return canWalk;
    }

    private void setCanWalk(boolean canWalk){
        this.canWalk = canWalk;
    }
}
