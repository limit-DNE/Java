package CreateZoo;

public interface AnimalSurvivalNeeds {

    int MAX_FOOD = 100;
    int MAX_SLEEP = 100;
    int SLEEP_MINIMUM = 30;
    int FOOD_MINIMUM = 30;
    boolean hasFood();
    boolean hasSleep();
    void useSleep(int sleepUsed);
    void useFood(int foodUsed);
    void eat();
    void sleep();
    int getFoodLevel();
    int getSleepLevel();
    void reproduce();
    void socialize();

}
