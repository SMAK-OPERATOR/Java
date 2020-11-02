public class Bubble <T extends Comparable> extends Sortinger<T> {

    @Override
    public void sort(T[] arr) {
        for(int i=0; i<arr.length; i++)
        {
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[i].compareTo(arr[j]) == 1)
                {
                    T t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }
        }
    }
}
