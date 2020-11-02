public class Ball extends SolidOfRevolution{
    public Ball(double volume, double radius) {
        super(volume, radius);
    }

    @Override
    public String toString() {
        return "Ball{" +
                "radius=" + radius +
                ", volume=" + volume +
                '}';
    }
}
