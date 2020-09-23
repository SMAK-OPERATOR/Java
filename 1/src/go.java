import java.util.Scanner;

public class go {
    public static void main(String[] args) {
        int g = -1;
        Scanner in = new Scanner(System.in);
        do{
            System.out.println("\nEnter the number of task you want to test, enter 0 to exit");
            g = in.nextInt();
            if (g!=0)
            {
                switch (g){
                    case 1:
                        FirstTask();
                        break;
                    case 2:
                        SecondTask();
                        break;
                    default:
                        System.out.println("\nYou entered the wrong number, try again");
                        break;
                }
            }
        }while (g != 0);
    }

    public static void FirstTask(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of the array\n");
        int n = in.nextInt();
        int[] valera = new int[n];
        int max = -1;
        int min = 11;
        int avg = 0;
        for (int i = 0; i != n;i++){
            valera[i] = (int)(Math.random()*10);
            System.out.print(valera[i] + " ");
            if (valera[i] > max)
                max = valera[i];
            if (valera[i] < min)
                min = valera[i];
            avg = avg + valera[i];
        }
        System.out.println("\nmax = "+max+"\n"+"min = "+min+"\n"+"Avg = "+avg/n);
    }

    public static void SecondTask(){
        Scanner in = new Scanner(System.in);
        System.out.println("\nEnter N and K\n");
        int n = in.nextInt();
        int k = in.nextInt();
        int avg = 0;
        for (int i = 0;i != n;i++){
            avg = avg + (int)Math.pow(i+1,k);
        }
        System.out.println("\nSumm = "+avg+"\n");
    }

}
