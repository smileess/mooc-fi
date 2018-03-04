
public class CashRegister {

    private double cashInRegister;
    private int economicalSold;
    private int gourmetSold;
    private static final double lunchEcon = 2.5;
    private static final double lunchGourmet = 4;

    public CashRegister() {
        // at start the register has 1000 euros
        this.cashInRegister = 1000;
        this.economicalSold = 0;
        this.gourmetSold = 0;
    
    
    }

    public double payEconomical(double cashGiven) {
        // price of the economical lunch is 2.50 euros
        
        // if the given cash is at least the price of the lunch:
        if (cashGiven >= lunchEcon) {
        //    the price of lunch is added to register
            this.cashInRegister += lunchEcon;
        //    the amount of sold lunch is incremented by one
            this.economicalSold++;
        //    method returns cashGiven - lunch price 
            return cashGiven - lunchEcon;
        // if not enough money given, all is returned and nothing else happens        
        }
        return cashGiven;
    }

    public double payGourmet(double cashGiven) {
        // price of the gourmet lunch is 4.00 euros
        
        // if the given cash is at least the price of the lunch:
        if (cashGiven >= lunchGourmet) {
        //    the price of lunch is added to register
            this.cashInRegister += lunchGourmet;
        //    the amount of sold lunch is incremented by one
            this.gourmetSold++;
        //    method returns cashGiven - lunch price 
            return cashGiven - lunchGourmet;
        // if not enough money given, all is returned and nothing else happens
        }
        return cashGiven;
    }


    public String toString() {
        return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold + " gourmet lunches sold: " + gourmetSold;
    }
    
    public boolean payEconomical(LyyraCard card) {
        if (card.balance() >= lunchEcon) {
            this.economicalSold++;
            card.pay(lunchEcon);
            return true;
        }
        return false;
    }
    
    public boolean payGourmet(LyyraCard card) {
        if (card.balance() >= lunchGourmet) {
            this.gourmetSold++;
            card.pay(lunchGourmet);
            return true;
        }
        return false;
    }
    
    public void loadMoneyToCard(LyyraCard card, double sum) {
        if (sum > 0) {
           card.loadMoney(sum);
           this.cashInRegister += sum; 
        }
        
    }
}