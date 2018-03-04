
public class Main {

    public static void main(String[] args) {
        // write test code here
        
        LyyraCard myCard = new LyyraCard(20.0);
        CashRegister register = new CashRegister();
        
        
        double theChange = register.payEconomical(10);
        theChange = register.payEconomical(5);
        theChange = register.payGourmet(4);
        System.out.println(register);
        register.payGourmet(myCard);
        System.out.println(register);
        
    }
}

