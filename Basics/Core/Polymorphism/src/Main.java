class Banker {
    private String name ;

    public Banker(String name) {
        this.name = name;
    }

    public String greet () {
        return "Default greetings";
    }
}

class SBIBank extends Banker {
    public SBIBank() {
        super("SBIBank");
    }

    @Override
    public String greet() {
        return "Welcome to SBI Bank";

    }
}

class BOABank extends Banker {
    public BOABank() {
        super("BOA Bank");
    }

    @Override
    public String greet() {
        return "Welcome to BOA";
    }
}

class MyBank extends Banker {
    public MyBank() {
        super("My Bank");
    }

    @Override
    public String greet() {
        return "Welcome to my bank";
    }
}


public class Main {
    public static void main(String[] args) {
        for (int i =1; i<5; i++){
            Banker banker = GenerateObjects();
            System.out.printf("Bank greet is: " +banker.greet());

        }

    }


    public static Banker GenerateObjects() {
        int random = (int) (Math.random() * 3) +1;
        System.out.println(random);
        switch (random) {
            case 1:
                return new SBIBank();
                //break;
            case 2:
                return new BOABank();
                //break;
            case 3:
                return new MyBank();
                //break;
            default:
                return null;
                //break;
        }
    }
}