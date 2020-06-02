

public interface IList<T>
{
    void add(int index, T element);
    void addFirst(T element);
    void addLast(T element);
    
    void delete(int index);
    void deleteFirst();
    void deleteLast();
    
    int size();
    void clear();
    boolean contains(T object);
    
    T get(int index);
    T getFirst();
    T getLast();
    
    void set(int index, T object);
}
