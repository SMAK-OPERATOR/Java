import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Vector vector1 = new Vector(1,2,3);
        Vector vector2 = new Vector(4,5,6);
        double j;
        System.out.println(vector1+"\n"+ vector2+"\n" +
                "Lenght of vector 1 is "+Vector.lenght(vector1)+
                "\nLenght of vector 2 is "+Vector.lenght(vector2)+
                "\nScalar product of vector 1 and 2 is "+Vector.scalar(vector1,vector2)+
                "\nAngle between vector 1 and 2 is "+Vector.angle(vector1,vector2)
        );
        System.out.println("Vector product of vector 1 and 2 is "+Vector.vect(vector1,vector2));
        System.out.println("Vector 1 plus vector 2 is "+Vector.plus(vector1,vector2)+"\n"+"Vector 2 minus vector 1 is "+Vector.minus(vector2,vector1));
        Scanner in = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = in.nextInt();
        Vector[] vectors = Vector.massiv(n);
        System.out.println("Vectors:\n");
        for(int i = 0;i != n;i++)
            System.out.println(vectors[i]);
    }
}
