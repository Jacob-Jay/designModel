package itereator;

/**
 * @author Jiangqing
 * @version 1.0
 * @since 2019-11-20 11:41
 */
public class ListByArray<E> implements Collection_<E> {
    Object[] arrays;
    int capacity;
    int index = 0;

    public ListByArray() {
        arrays = new Object[10];
        capacity = 10;
    }
    public ListByArray(Integer size) {
        this.arrays = new Object[size];
        capacity = size;
    }

    public void add(E e) {
        if (index >= capacity) {
            incre();
        }
        arrays[index++] = e;
    }


    private void incre() {
        Object[]newObs = new Object[capacity*2];
        capacity = capacity * 2;
        System.arraycopy(arrays,0,newObs ,0,index);
        arrays = newObs;
    }

    public Iterator_ getItereator() {
        return new ArrayIterator();
    }

    private class ArrayIterator implements Iterator_<E> {
        int mark = 0;
        public boolean hasNext() {
            return mark++ < index;
        }

        public E getNext() {
            return (E) arrays[mark-1];
        }
    }

}
