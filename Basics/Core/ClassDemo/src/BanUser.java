import javax.print.attribute.standard.JobName;

public class BanUser {

    public static void main (String args[]) {
//        BankApp John = new BankApp("John Doe" );
//
//        John.accAge(45);
//        John.depositeAmount(1000000);
//
//        John.getUserInfo();
//
//
//        BankApp Jane = new BankApp("Jane Doe");
//        Jane.accAge(25);
//        Jane.depositeAmount(4000000);
//
//        Jane.getUserInfo();
//
//
//        John.depositeAmount(200);
//        Jane.depositeAmount(50000);
//        Jane.getUserInfo();
//        John.getUserInfo();

        //Inheritance

        SbiUser ram =new SbiUser("ram");
        ram.depositeAmount(30);
        ram.accTax("MyTaxInfo");
        ram.getUserInfo();

    }


}
