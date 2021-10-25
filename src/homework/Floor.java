package homework;

public class Floor {

    private double width;
    private double length;

    //constructor
    public Floor(double width, double length) {
        // this.width = width;
        //this.length = length;
        if (width < 0 && length > 0) {
            this.width = 0;
            this.length = length;
        } else if (width > 0 && length < 0) {
            this.length = 0;
            this.width = width;
        } else if (width < 0 && length < 0) {
            this.width = 0;
            this.length = 0;
        } else {
            this.width = width;
            this.length = length;
        }
    }

    public double getArea() {
        return this.width * this.length;
    }
}
