

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
    
    Node<T> get(int index);
    Node<T> getFirst();
    Node<T> getLast();
    
    void set(int index, T object);
}
