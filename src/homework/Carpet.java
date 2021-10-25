package homework;

public class Carpet {

    double cost;//variable

    public Carpet(double cost) {
        if (cost < 0) {
            this.cost = 0;//because we have to initialize that is why this.cost
        } else
            this.cost = cost;
    }

    //instance variable
    public double getCost() {
        return this.cost;
    }
}
