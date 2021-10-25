package homework;

public class Programme9 {

    /*
. Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
 */
    public static void main(String[] args) {
        int maxNo =10;
        int PreNo = 0;
        int nextNo = 1;

        System.out.println("Fibonacci series of "+ maxNo +"numbers");

        for(int i =1;i<=maxNo;++i)
        {
            System.out.print( PreNo +" ");

            int sum = PreNo + nextNo;
            PreNo = nextNo;
            nextNo = sum;
        }
    }
}
