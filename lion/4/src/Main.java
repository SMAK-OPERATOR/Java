import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Integer[] arr = new Integer[10000];
        Random rand = new Random();
        for(int i=0; i<arr.length; i++) {
            arr[i] = rand.nextInt(10000);
        }
        Bubble<Integer> A = new Bubble<>();
        A.sortWithTime(arr);
        for(int i=0; i<arr.length; i++) {
            arr[i] = rand.nextInt(10000);
        }
        Inputs<Integer> B = new Inputs<>();
        B.sortWithTime(arr);
    }
}
