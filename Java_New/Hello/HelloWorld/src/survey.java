import java.util.Scanner;
public class survey {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome. Thank you for taking the survey");
        System.out.println("What is your name ?");
        String name = scan.nextLine();

        System.out.println("how much money do you spend in coffie");
        double coffiePrice= scan.nextDouble();



    }

}
