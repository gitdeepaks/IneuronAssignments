public class Methods {

    // public - visible to everyone
    //private - Visible only to class
    //Protected- Visible to the package and all the subclass

    //modifier return-type method-name(Parameters list) {
    // body
    //
    // }
    public static void main (String[] args){
        System.out.println("Hello");
        sayHello();
        sayHello();
        sayHello();

        int numberOne = 7;
        int numberTwo = 5;

        int result = minNUmber(numberOne, numberTwo);
        System.out.println(result);

    }

    public static void sayHello(){

        System.out.printf("Hello Java" );
        System.out.printf("How are you");
    }

    public static int minNUmber(int num1, int num2){
        int min;
        if (num1 > num2){
            min = num2;
        } else {
            min = num1;
        }

        return min;

    }

}
