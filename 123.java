import java.util.LinkedList;

public class Cache<T>{
    private final LinkedList<T> items;
    private final int maxSize;

    public Cache(int maxSize){
        if (maxSize <= 0){
            throw new IllegalArgumentException("Максимальный размер");

        }
        items.addLast(item);
        if (items.size() > maxSize){
            items.removeFirst();
        }
    }
    public boolean remove(T item){
        return items.remove(item);
    }
    public boolean exists(T item){
        return items.contains(item);
    }
    public T getFirst(){
        return items.isEmpty() ? null : items.getFirst();
    }
    public T getLast(){
        return items.isEmpty() ? null : items.getLast();
    }
    public T getItemByIndex(int i){
        if (i < 0 || i >= items.size()){
            return null;
        }
        return items.get(i);
    }
    public int size(){
        return items.size();
    }
    public boolean isEmpty(){
        return items.isEmpty();
    }
    public String toString(){
        return items.toString();
    }
}