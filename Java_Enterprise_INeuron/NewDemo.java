import java.nio.charset.MalformedInputException;
import java.util.jar.Manifest;
class Laptop
{
    String cpu;
    int ram;
    int hdd;
    public void compile()
    {
        System.out.println("Compiling");
        System.out.println(ram);

    }

}
public class NewDemo 
{
    public static void main(String[] args)
    {
        Laptop obj = new Laptop();  //creating an obeject and calling an mathod
        obj.ram =16;
        obj.compile(); //calling tthe Mathod
    }
    
}
