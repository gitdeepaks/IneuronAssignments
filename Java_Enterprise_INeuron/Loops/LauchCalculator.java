package Loops;
class Calculator
{     
      int a,b;
     void add()
    {
           a=10;
        b=20;
        int c=a+b;
        System.out.println(c);
    } 
}
public class LauchCalculator {
    public static void main(String[] args) {

        Calculator calc= new Calculator();
        calc.add();
    }
}
