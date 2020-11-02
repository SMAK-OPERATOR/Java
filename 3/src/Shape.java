public class Shape {
    double volume;

    public Shape(double volume) {
        this.volume = volume;
    }

    public Shape() {

    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "volume=" + volume +
                '}';
    }
}
