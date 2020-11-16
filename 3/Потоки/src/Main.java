import javax.naming.Name;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        int s = -1;
        Scanner in = new Scanner(System.in);
        do{
            System.out.println("\nWhat do you want to test?\n1 to 100 - 1\nCounter - 2\nNames - 3\nExit - 0\n");
            s = in.nextInt();
            switch (s){
                case(1):{
                    List<NumbersThread> Threads = new ArrayList<>();
                    for(int i = 0;i!=11;i++){
                        Threads.add(new NumbersThread());
                        System.out.println(Threads.get(i).getName()+" is about to start ");
                        Threads.get(i).start();
                    }
                    Thread.sleep(500);
                    break;
                }

                case(2):{
                    for(int i = 0;i!=101;i++){
                        CounterThread counterThread = new CounterThread();
                        counterThread.start();
                    }
                    Thread.sleep(500);
                    break;
                }

                case(3):{
                    NameThread nameThread1 = new NameThread();
                    NameThread nameThread2 = new NameThread();
                    System.out.print("Name of the first thread is ");
                    nameThread1.start();
                    Thread.sleep(100);
                    System.out.print("\nName of the second thread is ");
                    nameThread2.start();
                    Thread.sleep(500);
                    break;
                }

                default:{
                    break;
                }
            }
        }while(s != 0);
    }
}
