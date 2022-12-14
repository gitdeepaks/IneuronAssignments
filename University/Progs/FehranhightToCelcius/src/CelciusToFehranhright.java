import java.util.Scanner;import java.util.Scanner;

public class CelciusToFehranhright {
    public static void main (String args[]) {
        int temp;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the temp in Celcius: ");
        temp = in.nextInt();
        temp =  (temp *9/5)+32;
        System.out.println("Temprature in Fehranhright is : " + temp);
    }
}