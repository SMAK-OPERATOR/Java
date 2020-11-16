public class CounterThread extends Thread{
    @Override
    public void run() {
        Counter counter = new Counter();
        for(int i = 0;i != 1000;i++){
            counter.increment();
        }
        System.out.print(counter.getCount()+" ");
    }
}
