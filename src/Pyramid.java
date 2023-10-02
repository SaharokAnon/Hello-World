public class Pyramid implements Shape {

    double width;
    double h;
    public Pyramid(double width, double h) {
        this.width = width;
        this.h = h;
    }
    @Override
    public double getVolume() {
        return width * width * h / 3;
    }
}
