package encapsulation26;

public class TestEncapsulation {

    public static void main(String[] args) {
        Encapsulate obj = new Encapsulate();
        // setting value of the variables
        obj.setName("Anand");
        obj.setAge(42);
        obj.setRollNo(25);

        // Displaying values of the variables

        System.out.println("Prime's name:" + obj.getName());
        System.out.println("Prime's age:" + obj.getAge());
        System.out.println("Prime's rollNo:" + obj.getRollNo());

        //Direct access of roll no is not possible due to encapsulation

        //System.out.println("Prime's roll no :" + obj.geekName);


    }

}
