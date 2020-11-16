public class SolidOfRevolution extends Shape{
    double radius;

    public SolidOfRevolution(double volume, double radius) {
        super(volume);
        this.radius = radius;
    }

    public SolidOfRevolution(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "SolidOfRevolution{" +
                "radius=" + radius +
                ", volume=" + volume +
                '}';
    }
}
