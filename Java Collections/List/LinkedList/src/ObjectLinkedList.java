public class ObjectLinkedList implements NodeInterface {

    private ObjectList root = null;

    public ObjectLinkedList(ObjectList root){
        this.root = root;
    }


    @Override
    public ObjectList getRoot() {
        return this.root;
    }

    @Override
    public boolean addObject(ObjectList objectValue) {
        if (this.root == null){
            this.root = objectValue;
            System.out.println("\nObject added as the head of the list.");
            return true;
        } else {
            ObjectList currentObject = this.root;
            while (currentObject != null){
                int comparison = currentObject.compareTo(objectValue);
                if (comparison == 0){
                    System.out.println("\nThis object is already present.");
                    return false;
                } else if (comparison > 0){
                    if (currentObject.previous() != null){
                        currentObject.previous().setNext(objectValue).setPrevious(currentObject.previous());
                        objectValue.setNext(currentObject).setPrevious(objectValue);
                    } else {
                        objectValue.setNext(this.root).setPrevious(objectValue);
                        this.root = objectValue;
                    }
                    return true;
                } else {
                    if (currentObject.next() != null){
                        currentObject = currentObject.next();
                    } else {
                        currentObject.setNext(objectValue).setPrevious(currentObject);
                        return true;
                    }
                }
            }
            return false;
        }
    }

    @Override
    public boolean removeObject(ObjectList objectValue) {
        if (!checkIfObjectExists(objectValue)) {
            System.out.println("\nObject does not exist, no removal possible.");
        } else {
            ObjectList currentObject = this.root;
            while (currentObject != null){
                if (currentObject.getObjectValue().equals(objectValue.getObjectValue())){
                    if (currentObject == this.root){
                        this.root = currentObject.next();
                    } else {
                        currentObject.previous().setNext(currentObject.next());
                        if (currentObject.next() != null){
                            currentObject.next().setPrevious(currentObject.previous());
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public void traverse(ObjectList root) {
        System.out.println();
        while (root != null){
            System.out.println(root.getObjectValue());
            root = root.next();
        }
    }

    @Override
    public boolean checkIfObjectExists(ObjectList objectValue) {
        ObjectList root = this.root;
        if (root == null){
            System.out.println("List is empty. Can't check for object.");
        } else {
            while (root != null){
                if (objectValue.getObjectValue().equals(root.getObjectValue())){
                    return true;
                } else {
                    root = root.next();
                }
            }
        }
        return false;
    }
}
