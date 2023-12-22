package array.generici;

public class AbstractGenericsArray <E> implements GenericsArray<E>{
    private E[] array;
    private int size;

    protected AbstractGenericsArray(){
        this.array =(E[]) new Object[10];
        this.size = 0;
    }

    @Override
    public void add(E element){
        this.array[size++] = element;
        this.enlargeArray();
    }

    @Override
    public E get(int index){
        if(index < this.size){
            return this.array[index];
        }else{
            return null;
        }
    }

    @Override
    public E[] toArray(){
        return this.array;
    }

    @Override
    public int size(){
        return this.size;
    }

    private void enlargeArray(){
        if(this.size == this.array.length){
            E[]newArray = (E[]) new Object[this.array.length + 10];
            for(int i=0; i< this.array.length; i++){
                newArray[i]= this.array[i];
            }
            this.array = newArray;
        }

    }
}
