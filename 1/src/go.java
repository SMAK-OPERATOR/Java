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
                    case 3:
                        ThirdTask();
                        break;
                    case 4:
                        FourthTask();
                        break;
                    case 5:
                        FifthTask();
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

    public static void ThirdTask(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of the array\n");
        int n = in.nextInt();
        int[] valera = new int[n];
        for(int i = 0;i != n;i++){
            valera[i] = (int)(Math.random()*10);
            System.out.print(valera[i] + " ");
        }
        System.out.println();
        int m;
        int l = -1;
        for(int i = 0;i != n;i++){
            int min = 11;
            for(int j = i;j != n; j++)
            {
                if(min > valera[j]) {
                    min = valera[j];
                    l = j;
                }
            }
            m = valera[i];
            valera[i] = min;
            valera[l] = m;
            System.out.print(valera[i] + " ");
        }
    }

    public static void FourthTask(){
        Scanner in = new Scanner(System.in);
        int[] arr = new int[101];
        for(int i = 2;i!=101;i++){
            arr[i] = i;
            if(((arr[i]%3) != 0) && ((arr[i] % 2) != 0) && ((arr[i] % 5) != 0) && ((arr[i] % 7) != 0))
                System.out.print(arr[i]+" ");
            else if((arr[i] == 2) || (arr[i] == 3) || (arr[i] == 5) || (arr[i] == 7))
                System.out.print(arr[i]+" ");
        }
    }

    public static void FifthTask(){
        Scanner in = new Scanner(System.in);
        int[] f = new int[40];
        f[0] = 0;
        f[1] = 1;
        for(int i = 2;i != 40;i++){
            f[i] = f[i-1] + f[i-2];
        }
        System.out.println("Enter N");
        int n = in.nextInt();
        System.out.println("Fibonacci number "+n+" = "+f[n-1]);
    }
}
