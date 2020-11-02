public class Rotation extends SolidOfRevolution{
    public Rotation( double radius) {
        super(radius);
        volume = getVolume(radius);
    }


    public double getVolume(double radius){
        int a = 0;
        int n = 100;
        double s = 0;
        double d = (radius - a)/n;
        double xb = a;
        for(int i = 0;i < n; i++){
            double xe = xb + d;
            double xm = (xb + xe)/2;
            s = s + d * xm * xm;
            xb = xe;
        }
        return s;
    }

    @Override
    public String toString() {
        return "Rotation{" +
                "radius=" + radius +
                ", volume=" + volume +
                '}';
    }
}
