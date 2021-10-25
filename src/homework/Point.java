package homework;

public class Point {

    int x, y;

    public Point() {

    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    //method to find distance between (0,0) and current point(x,y)
    public double distance() {
        int dx = 0;
        int dy = 0;
        double result = Math.sqrt((this.x - dx) * (this.x - dx) + (this.y - dy) * (this.y - dy));
        return result;
    }

    // method to find distance between current point (this.x, this.y) and parameter (x,y)
    public double distance(int x, int y) {
        double result = Math.sqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y));
        return result;

    }

    //Method to find distance between two points
    public double distance(Point p) {
        double result = Math.sqrt((this.x - p.x) * (this.x - p.x) + (this.y - p.y) * (this.y - p.y));
        return result;

    }

    public static void main(String[] args) {
        Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance()); //Find distace between first point and (0,0)
        System.out.println("distance(second)= " + first.distance(second)); //Find distance between points first and second
        System.out.println("distance(2,2)= " + first.distance(2, 2)); //Find distance between current point and (2,2)
        Point point = new Point();
        System.out.println("distance()= " + point.distance()); //find distance between current point and (0,0)


    }
}
