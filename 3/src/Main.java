import java.nio.Buffer;
import java.util.Scanner;

public class Main {
    private static Dialog dialog;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = -1;

        do {
            System.out.println("\nWhat do you want to test?\nBoxing - 1\nDegrees - 2\nExit - 0\n");
            s = in.nextInt();
            switch (s){
                case(1):{
                    int m = -1;
                    System.out.println("Enter the size of the box");
                    int size = in.nextInt();
                    Box box = new Box(size);
                    do{
                        System.out.print("\nWhat do you want to do?\nCreate a new Ball - 1\nCreate a new Cylinder - 2\nCreate a new Pyramid - 3\nCreate a new Rotate figure of x^2 function - 4\nShow what's in the box - 5\nExit - 0\n");
                        m = in.nextInt();
                        switch (m){
                            case(1):{
                                System.out.println("Enter volume and radius of the ball");
                                if (!box.add(new Ball(in.nextDouble(), in.nextDouble())))
                                    System.out.println("Box is full");
                                else System.out.println("Ball in the box");
                                break;
                            }
                            case(2):{
                                System.out.println("Enter volume,radius and height of the Cylinder");
                                if (!box.add(new Cylinder(in.nextDouble(), in.nextDouble(), in.nextDouble())))
                                    System.out.println("Box is full");
                                else System.out.println("Cylinder in the box");
                                break;
                            }
                            case(3):{
                                System.out.println("Enter volume,s and h of the Pyramid");
                                if (!box.add(new Pyramid(in.nextDouble(), in.nextDouble(),in.nextDouble())))
                                    System.out.println("Box is full");
                                else System.out.println("Pyramid in the box");
                                break;
                            }
                            case(4):{
                                System.out.println("Enter radius of the figure");
                                if (!box.add(new Rotation(in.nextDouble())))
                                    System.out.println("Box is full");
                                else System.out.println("Figure in the box");
                                break;
                            }
                            case(5):{
                                box.show();
                                break;
                            }
                            default: break;
                        }
                    }while (m != 0);
                    break;
                }
                case(2):{
                    boolean country = false;
                    String string;
                    int j = 0;
                    do{
                        System.out.println("Your country is USA? \ny/n:");
                        string = in.next();
                        System.out.println(string);
                        if (((string.equals("y"))||(string.equals("n"))))
                            j = 1;
                    }while(j == 0);

                    if (string.equals("y")){
                        country = true;
                    } else if(string.equals("n")) {
                        country = false;
                    }
                    configure(country);
                    System.out.println("Enter degrees in celsius");
                    float C = in.nextFloat();
                    runConvert(C);
                }
            }
        }while(s!=0);
    }

    static void configure(boolean country){
        if(country){
            dialog = new FarDialog();
        } else if (!country) {
            dialog = new KelvDialog();
        }
    }

    static void runConvert(float c){
        dialog.Output(c);
    }
}

