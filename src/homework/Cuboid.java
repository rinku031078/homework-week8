package homework;

public class Cuboid extends Rectangle {

    double height;

    public double getHeight() {
        return height;
    }

    public Cuboid(double width, double length, double height) {
        super(width, length);
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    public double getVolume() {
        double volume = height * super.getArea();
        return volume;
    }


}
