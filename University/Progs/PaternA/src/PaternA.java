public class PaternA {

    public static void main (String args[]) {
// Patern A
        for (int i =0 ; i <=10 ; i++) {

            for ( int j = 1; j <= i; j++ ) {
                System.out.printf("*");
            }

            System.out.println("");
        }

//         Patern b
        for (int i =5 ; i > 0 ; i--) {

            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }


            System.out.println("");
        }
        // Patern c
        for (int i =5 ; i > 0 ; i--) {

            for (int j = 0; j < i; j++) {
                System.out.print(j+1);
            }


            System.out.println("");
        }




    }




}
