public class GradeGeetings {
    public static void main (String args[]) {

        // Take input from User
        char grade = 'G' ;
        switch (grade) {
            case 'A':
                System.out.println("V.Good");
                break;
            case 'B':
                System.out.println("Good");
                break;
            case 'C':
                System.out.println("Fair");
                break;
            case 'D':
                System.out.println("Bad");
                break;
            case 'F':
                System.out.println("V.Bad");
                break;
            default:
                System.out.println("Grade can Only be A to F");
        }
    }

    }
