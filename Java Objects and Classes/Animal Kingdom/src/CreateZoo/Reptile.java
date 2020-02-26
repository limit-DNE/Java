package CreateZoo;

public interface Reptile {
    String HABITAT = "Forest";
    String REPRODUCTION_TYPE = "Oviparous";
    void crawl();
    boolean canCrawl();
    void swim();
    boolean canSwim();
    void walk();
    boolean canWalk();
}
