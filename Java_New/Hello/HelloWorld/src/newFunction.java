import java.util.Scanner;

public class newFunction {

    public static void pringHello(){
        System.out.println("Hello Java");

    }

    public static void  claSum(int a, int b){  //Parameters or Formal Parameters

        int sum = a + b;
        System.out.println("sum is: " +sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b = sc.nextInt();
       claSum(a,b); //arguments or actual parameters
       pringHello();
    }

    }
