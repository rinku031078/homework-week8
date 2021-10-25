package lastweekhomework;

/*
 * Write a Java program to test if an array contains a specific value.
 */

public class Programme20 {

    int[] year = {1980, 1981, 1982, 1983, 1984, 1985, 1986, 1987}; //instance array variable
    int searchYear = 1980; //instance variable

    public static void main(String[] args) {
        Programme20 hw20 = new Programme20(); // Creating class object to reference instance variables
        boolean isMatching = false;
        for (int i : hw20.year) {
            //search our searchYear
            if (hw20.searchYear == i) {
                isMatching = true;
                // break; ///break the loop when searchYear is found.
            }
        }

        if (isMatching) {
            System.out.println("The year exists");
        } else
            System.out.println("The year does not exist");
    }

}
