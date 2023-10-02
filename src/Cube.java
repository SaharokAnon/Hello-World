public class Cube implements Shape{
    double width;

    public Cube(double width) {
        this.width = width;
    }

    @Override
    public double getVolume() {
        return width * width * width;
    }
}
