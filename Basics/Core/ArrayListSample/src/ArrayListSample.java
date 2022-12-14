import java.util.ArrayList;

public class ArrayListSample {

    public static void main (String[] args){

//        String[] stringArray = new String[10];
//        stringArray[0] = "Jaipur";
//
//        System.out.println(stringArray[0]);


        //Array List

        ArrayList<String> heros = new ArrayList<String>();

        heros.add("Hulk");
        heros.add("IronMan");
        heros.add("CaptainAmerica");
        heros.add("BatMan");
        heros.add( 0,  "Thor" ) ;
        heros.add(3,"Bruce");


        System.out.println("My Super hero is: " +  heros.get(0));
        System.out.println("My Super hero is: " +  heros.get(1));
        System.out.println("My Super hero is: " +  heros.get(2));
        System.out.println("My Super hero is: " +  heros.get(3));





    }

    }
