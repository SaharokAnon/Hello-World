import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Pyramid implements Shape {

    double width;
    double h;

    public double getVolume() {
        return width * width * h / 3;
    }
}
