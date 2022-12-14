import java.util.Scanner;

public class FehranhightToCelcius {
    public static void main (String args[]) {
        int temp;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the temp in F: ");
        temp = in.nextInt();
        temp = ((temp -32)*5)/9;
        System.out.println("Temprature in Celsius is : " + temp);
    }
}
