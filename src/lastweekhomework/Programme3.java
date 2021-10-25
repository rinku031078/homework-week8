package lastweekhomework;
/*
 * Write a java program to input student Name, roll No, and three subjects Math, Science and
 * English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
 * Input, Marks should between 0 to 100”) and find out total, percentage and result.
 * If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
 * %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
 * _______________________________
 * | |
 * | Mark Sheet |
 * |_______________________________|
 * | Name : Jay |
 * | Roll No: 08 |
 * |_______________________________|
 * | Subjects : Marks |
 * |_______________________________|
 * | Math : 98 |
 * | Science : 90 |
 * | English : 85 |
 * |_______________________________|
 * | Total : 273 |
 * |_______________________________|
 * | Percentage : 91.0 |
 * | Result : Pass |
 * | Grade : A+ |
 * |_______________________________|
 */

import java.util.Scanner;

public class Programme3 {
    static String name;
    static int rollNum;
    static int maths;
    static int english;
    static int science;
    static double percentage;
    static String result;
    static String grade;
    static int total;

    public void getStudentInfo() {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter your name");
        name = obj.nextLine();
        System.out.println("Enter roll no");
        rollNum = obj.nextInt();
        System.out.println("Enter maths mark (0 to 100):");
        maths = obj.nextInt();
        if (maths < 0 || maths > 100) {
            System.out.println("Invalid input, marks should be between 0 to 100");
            System.exit(0);
        }

        System.out.println("Enter science mark (0 to 100): ");
        science = obj.nextInt();
        if (science < 0 || science > 100) {
            System.out.println("Invalid input, marks should be between 0 to 100");
            System.exit(0);
        }
        System.out.println("Enter english mark (0 to 100):");
        english = obj.nextInt();
        if (english < 0 || english > 100) {
            System.out.println("Invalid input, marks should be between 0 to 100");
            System.exit(0);
        }
    }

    public void calculateresult() {
        total = maths + science + english;
        percentage = total / 3.0;
        result = percentage >= 35 ? "Pass" : "Fail";

        if (percentage >= 80)
            grade = "A+";
        else if (percentage >= 60)
            grade = "A";
        else if (percentage >= 50)
            grade = "B";
        else if (percentage >= 35)
            grade = "C";
        else
            grade = "Fail";

    }

    public static void main(String[] args) {
        Programme3 hw3 = new Programme3();
        hw3.getStudentInfo();
        hw3.calculateresult();

        System.out.println("_______________________________ ");
        System.out.println("| | ");
        System.out.println("| Mark Sheet | ");
        System.out.println("|_______________________________|");
        System.out.println("| Name :  " + name);
        System.out.println("| Roll No: " + rollNum);
        System.out.println("|_______________________________| ");
        System.out.println("| Subjects :  | ");
        System.out.println("|_______________________________|");
        System.out.println("| Math :   " + maths);
        System.out.println("| Science :   " + science);
        System.out.println("| English :   " + english);
        System.out.println("|____________________________");
        System.out.println("| Total :   " + total);
        System.out.println("|_______________________________|");
        System.out.println("| Percentage :   " + percentage);
        System.out.println("| Result :   " + result);
        System.out.println("| Grade :   " + grade);
        System.out.println("|_______________________________|  ");
    }

}
