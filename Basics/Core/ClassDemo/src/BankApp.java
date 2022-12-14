public class BankApp {

    String name;
    int age;
    String taxDetail;
    double amount;


    //Constructor
    public BankApp(String name) {
        this.name = name;
        System.out.println("Constructor Called");

    }

    //ask user for age

    public void  accAge(int age) {
        this.age =age;
    }

    public void accTax(String textDetail){
        this.taxDetail =textDetail;
    }

    public void depositeAmount(double amount){
        this.amount =amount;
    }

    public void  getUserInfo(){
        System.out.println("name of user is: " + this.name);
        System.out.println("name of Balance is: " + amount);
    }
}
