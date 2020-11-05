public class NameThread extends Thread {
    @Override
    public void run() {
        System.out.println(getName());
    }
}
