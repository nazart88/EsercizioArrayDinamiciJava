package array.generici;

public interface GenericsArray<E> {
 void add(E element);
 E get(int index);
 E[]toArray();
 int size();

}
