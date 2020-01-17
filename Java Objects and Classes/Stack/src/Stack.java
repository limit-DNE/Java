import java.util.ArrayList;

public class Stack{

    private ArrayList<Object> list = new ArrayList<>();

    public boolean isEmpty(){
        return list.isEmpty();
    }

    public int getSize(){
        return  list.size();
    }

    public Object peek(){
        return list.get(getSize() - 1);
    }

    public Object pop(){
        Object object = list.get(getSize() - 1);
        list.remove(getSize() - 1);
        return object;
    }

    public void push(Object object){
        list.add(object);
    }

    @Override
    public String toString(){
        return "Stack: " + list.toString();
    }
}
