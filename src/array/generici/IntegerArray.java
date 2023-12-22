package array.generici;

public class IntegerArray extends AbstractGenericsArray<Integer> {
    public IntegerArray(){
        super();
    }

    @Override
    public Integer[] toArray(){
        Object[] arr = super.toArray();
        Integer[] intArr = new Integer[this.size()];
        for(int i=0; i< this.size(); i++){
            intArr[i] = (Integer) arr[i];
        }
        return intArr;
    }
}
