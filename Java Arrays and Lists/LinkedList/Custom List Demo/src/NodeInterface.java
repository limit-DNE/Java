public interface NodeInterface {

    ObjectList getRoot();
    boolean addObject(ObjectList objectValue);
    boolean removeObject(ObjectList ojectValue);
    void traverse(ObjectList root);
    boolean checkIfObjectExists(ObjectList objectValue);
}
