import java.io.IOException;
public class Main {

    public static void main(String[] args) throws IOException {

        int radius;
        double area;

        radius = Input.readData();

        area = Compute.calcArea(radius);

        Output.display("원의 반지름", radius);
        Output.display("원의 면적", area);
    }
}