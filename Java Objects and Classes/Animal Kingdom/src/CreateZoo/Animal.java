package CreateZoo;

public abstract class Animal {

    private String name;

    protected Animal (String name){
        setName(name);
    }

    public String getName(){
        return name;
    }

    private void setName(String name){
        this.name = name;
    }

    protected abstract void getAnimalInfo();
    protected abstract void print(String text);
    protected abstract String getReproductionType();
    protected abstract String getHabitat();
    protected abstract void setHabitat(String habitat);
    protected abstract void setReproductionType(String reproductionType);
    public abstract void addToZoo(Object animal);
    public abstract boolean isAddedToZoo();
}
