public class Vector {
    int x,y,z;

    public Vector(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public static double lenght(Vector a){
     double len = Math.sqrt(Math.pow(a.x,2)+Math.pow(a.y,2)+Math.pow(a.z,2));
     return len;
    }

    public static double scalar(Vector a,Vector b){
        double scal = (a.x * b.x + a.y * b.y + a.z * b.z);
        return scal;
    }

    public static Vector vect(Vector a,Vector b){
        Vector sca = new Vector(a.y * b.z - a.z * b.y,a.z * b.x - a.x * b.z,a.x * b.y - a.y * b.x);
        return sca;
    }

    public static double angle(Vector a, Vector b){
        double ang = scalar(a,b) / (lenght(a) * lenght(b));
        return ang;
    }

    public static Vector plus(Vector a,Vector b){
        Vector pl = new Vector(a.x + b.x,a.y + b.y,a.z + b.z);
        return pl;
    }

    public static Vector minus(Vector a,Vector b){
        Vector min = new Vector(a.x - b.x,a.y - b.y,a.z - b.z);
        return min;
    }

    public static Vector[] massiv(int n){
        Vector[] mas = new Vector[n];
        for(int i = 0;i!=n;i++){
            mas[i] = new Vector(((int)(Math.random()*10)),((int)(Math.random()*10)),((int)(Math.random()*10)));
        }
        return mas;
    }

    @Override
    public String toString() {
        return "Vector{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
