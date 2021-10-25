package homework;

public class Calculator {

    Floor floor;//instance variable
    Carpet carpet;

    public Calculator(Floor f, Carpet c) {//constructor
        this.floor = f;
        this.carpet = c;

    }

    public double getTotalCost() {
        return floor.getArea() * carpet.getCost();//instance method
    }
}
