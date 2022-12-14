public class ArrayExercise {

    public static void main (String argd []) {

        //declare in Array
        int[] exerciseArray = {333342, 94,5,65,68,97,89,434,66,8844,};

        // print array elements
        for (int i = 0; i<exerciseArray.length; i++){
            System.out.println(exerciseArray[i]);
        }

        // find the largest number
        int largest =exerciseArray[0];
        for (int i= 1; i<exerciseArray.length; i++){
            if (exerciseArray[i] > largest){
                largest = exerciseArray[i];

            }
        }
        System.out.printf("Largest Number is " + largest);

        //Sum up all elements
        int sum =0;
        for (int i =1; i < exerciseArray.length; i++) {
           // sum += exerciseArray[i];
            sum = sum =exerciseArray[i];

        }
        System.out.println("Sum is;  " +sum);



    }

    }
