import javax.lang.model.util.ElementScanner14;

public class NewSwitch {
    public static void main(String[] args) {
        int num =1;

        // if (num==1)
        // System.out.println("One");
        // else if(num==2)
        // System.out.println("Two");
        // else if(num==3)
        // System.out.println("Three");
        // else
        // System.out.println("GetLost");

        switch(num){
            case 1: 
            System.out.println("one");
            break;
            case 2: 
            System.out.println("two");
            break;
            case 3: 
            System.out.println("Three");
            break;
            default: 
            System.out.println("GetLost");
            
        }
    }
    
}
