package homework;

public class Cylinder extends Circle {

    double height;

    public Cylinder(double radius, double height) {
        super(radius);
        if(height<0){
            this.height=0;
        }
        else
            this.height=height;
    }
    public double getHeight() {
        return height;

    }
    public double getVolume(){

        double volume = super.getArea()*height;
        return  volume;
    }
}
