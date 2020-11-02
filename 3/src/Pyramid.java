public class Pyramid extends Shape{
    double s;
    double h;

    public double getS() {
        return s;
    }

    public void setS(double s) {
        this.s = s;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public Pyramid(double volume, double s, double h) {
        super(volume);
        this.s = s;
        this.h = h;
    }

    @Override
    public String toString() {
        return "Pyramid{" +
                "s=" + s +
                ", h=" + h +
                ", volume=" + volume +
                '}';
    }
}
