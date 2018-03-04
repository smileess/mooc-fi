
public class Accounts {

    public static void main(String[] args) {
        // Code in Account.Java should not be touched!
        // write your code here
        
        Account acctMatt = new Account("Matt's account", 1000.00);
        Account acctSean = new Account("My account", 0.00);
        
        acctMatt.withdrawal(100);
        acctSean.deposit(100);
        
        System.out.println(acctMatt);
        System.out.println(acctSean);
    }

}
