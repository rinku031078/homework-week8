package homework;

public class SimpleCalculator {

    double firstNumber;
    double secondNumber;

    //Method to get first number
    public double getFirstNumber() {
        return firstNumber;
    }

    //Method to set first number
    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    //Method to get second number
    public double getSecondNumber() {
        return secondNumber;
    }

    //Method to set second number
    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    //Method to add two numbers
    public double getAdditionResult(){
        return firstNumber+secondNumber;

    }

    //Method to substract a number from another
    public double  getSubtractionResult(){
        return firstNumber-secondNumber;
    }

    //Method to multiply two numbers
    public double getMultiplicationResult(){
        return firstNumber*secondNumber;
    }

    //Method to devide a number by another number
    public double getDivisionResult(){
        if (secondNumber==0){
            return 0;
        }
        else
            return firstNumber/secondNumber;
    }

    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.0); //Set first number
        calculator.setSecondNumber(4);  //set second number
        System.out.println("add= " + calculator.getAdditionResult()); // get addition result
        System.out.println("subtract= " + calculator.getSubtractionResult()); //get substraction result
        calculator.setFirstNumber(5.25); //set first number
        calculator.setSecondNumber(0); //set second number
        System.out.println("multiply= " + calculator.getMultiplicationResult()); //get multiplication result
        System.out.println("divide= " + calculator.getDivisionResult()); //get division result

    }
}
