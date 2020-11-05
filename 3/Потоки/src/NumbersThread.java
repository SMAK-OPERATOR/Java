public class NumbersThread extends Thread{

    public NumbersThread() {
    }

    @Override
    public void run() {
        System.out.println(getName()+" is Starting ");
        for(int i = 0;i!=101;i++){
            System.out.print(i+" ");
        }
        System.out.print(getName()+" is Stopping ");
    }
}
