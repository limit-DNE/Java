public abstract class ObjectList {

    protected ObjectList linkRight = null;
    protected ObjectList linkLeft = null;
    protected Object objectValue;

    public ObjectList(Object objectValue){
        this.objectValue = objectValue;
    }

    public Object getObjectValue() {
        return objectValue;
    }

    public void setObjectValue(Object objectValue) {
        this.objectValue = objectValue;
    }

    abstract ObjectList next();
    abstract ObjectList setNext(ObjectList objectValue);
    abstract ObjectList previous();
    abstract ObjectList setPrevious(ObjectList objectValue);
    abstract int compareTo(ObjectList objectValue);

}
