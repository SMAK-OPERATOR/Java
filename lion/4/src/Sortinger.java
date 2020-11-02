 public abstract class Sortinger <T extends Comparable> {

    public abstract void sort(T[] arr);

    void sortWithTime(T[] arr){
        double time = System.currentTimeMillis();
        sort(arr);
        System.out.println(System.currentTimeMillis() - time);
    }

 }
