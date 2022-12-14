import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

//        Banker John = new Banker("John", 29999.44);
//        Banker Jane;
//        Jane = John;
//
//        Jane.setcBalance(5.1);
//
//        System.out.println(John.getcBalance());
        ArrayList<Integer> myintList = new ArrayList<>();
        myintList.add(5);
        myintList.add(5);
        myintList.add(8);
        myintList.add(9);

        for (int i = 0; i < myintList.size(); i++) {
            System.out.println(i + "---" + myintList.get(i));
        }
        myintList.add(1, 6);
        System.out.println("-----------------------");
        for (int i = 0; i < myintList.size(); i++) {
            System.out.println(i + "---" + myintList.get(i));

        }


//        LinkedList example here
        LinkedList<String> programming =new LinkedList<>();
        programming.add("C");
        programming.add("Java");
        programming.add("Python");

        //Iterators

        pllist(programming);

        programming.add(1, "Golang");
        pllist(programming);


    }

    public static void pllist(LinkedList<String> ll) {
        Iterator<String> i =  ll.iterator();
        while (i.hasNext()) {
            System.out.println("Your Language is : " + i.next() );
        }


    }

}