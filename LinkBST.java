package Lab7;

public interface LinkBST <E>{
    void insert(E x) throws ItemDuplicated;
    void remove(E x);
    E search(E x) throws ItemNoFound;
    boolean isEmpty();
}
