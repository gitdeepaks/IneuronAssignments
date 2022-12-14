import com.sun.jdi.Value;

public class MaxyFinder {

    public static <T extends Comparable<T>> T maxy( T x, T y, T z) {

        T maxy = x;

        if (y.compareTo(maxy) > 0){
            maxy =y;
        }

        if (z.compareTo(maxy) > 0){
            maxy =z ;

        }
        return maxy ;


    }

    public static void main(String[] args) {

        System.out.printf(" Max is: %d " , maxy(2,4,3) );

        Holder<String> stringValue = new Holder<>();
        stringValue.setMyVar("\n class");
        System.out.println(stringValue.getMyVar());

        Holder<Integer> intValue = new Holder<>();
        intValue.setMyVar(new Integer(5));
        System.out.println(intValue.getMyVar());



    }
}