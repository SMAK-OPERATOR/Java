import java.util.Arrays;

public class Box extends Shape{
    protected Shape[] Shapes;
    protected int i;
    protected int s;

    public Box(int n) {
        Shapes = new Shape[100];
        i = n;
        s = 0;
    }

    public boolean add(Shape a){
        if(i >= a.volume) {
            Shapes[s] = a;
            s++;
            i -= a.volume;
            return true;
        }
        else return false;
    }

    public void show(){
        if (s != 0){
            int k = 0;
            do{
                System.out.println(Shapes[k]);
                k++;
            }while(Shapes[k] != null);
            System.out.println("Remainning space:"+getI());
        }
        else System.out.println("Box is empty");
    }

    @Override
    public String toString() {
        return "Box{" +
                "Shapes=" + Arrays.toString(Shapes) +
                ", i=" + i +
                ", s=" + s +
                ", volume=" + volume +
                '}';
    }

    public Shape[] getShapes() {
        return Shapes;
    }

    public void setShapes(Shape[] shapes) {
        Shapes = shapes;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getS() {
        return s;
    }

    public void setS(int s) {
        this.s = s;
    }
}
