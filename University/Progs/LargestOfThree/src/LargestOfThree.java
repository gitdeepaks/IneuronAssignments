import java.util.Scanner;

public class LargestOfThree {
    public static void main (String args[]) {
        int num1, num2, num3;

        System.out.printf("Please Enter 3 Numbers" );
        Scanner in =new Scanner(System.in);
        num1 = in.nextInt();
        num2 = in.nextInt();
        num3 = in.nextInt();


        if (num1 > num2 && num1 > num3 ) {
            System.out.println(num1 + "is the largest of numbers");

        }
        if (num2 > num1 && num2 > num3 ) {
            System.out.println(num2+ "is the largest");
        }
        if (num3 > num1 && num3 > num2) {
            System.out.println(num3 + "is the the Largest");
        }
        else
            System.out.println("all are equal");
    }
}
