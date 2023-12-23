package array.generici;

public class DynamicsArray <E> extends AbstractGenericsArray<E>{
    public DynamicsArray(){
        super();
    }

    @Override
    public E[] toArray(){
        E[] temp = super.toArray();
        E[] arr =(E[]) new Object[this.size()];
        for(int i = 0; i < this.size(); i++){
            arr[i]  = temp[i];
        }
        return arr;
    }
}
