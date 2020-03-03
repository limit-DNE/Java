public class ObjectListNode extends ObjectList{


    public ObjectListNode(Object objectValue) {
        super(objectValue);
    }

    @Override
    ObjectList next() {
        return this.linkRight;
    }

    @Override
    ObjectList setNext(ObjectList objectValue) {
        this.linkRight = objectValue;
        return this.linkRight;
    }

    @Override
    ObjectList previous() {
        return this.linkLeft;
    }

    @Override
    ObjectList setPrevious(ObjectList objectValue) {
        this.linkLeft = objectValue;
        return this.linkLeft;
    }

    @Override
    int compareTo(ObjectList objectValue) {
        if (objectValue == null){
            return -1;
        } else {
            return ((String) super.getObjectValue()).compareTo((String) objectValue.getObjectValue());
        }
    }
}
