
public class Accounts {

    public static void main(String[] args) {
        // Code in Account.Java should not be touched!
        // write your code here
        Account acctPersonA = new Account("A", 100.0);
        Account acctPersonB = new Account("B", 0.0);
        Account acctPersonC = new Account("C", 0.0);
        
        transfer(acctPersonA, acctPersonB, 50);
        transfer(acctPersonB, acctPersonC, 25);
        
    }
    
    public static void transfer(Account from, Account to, double howMuch) {
        from.withdrawal(howMuch);
        to.deposit(howMuch);
        
        
        
    }


}
