
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }


        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }
    
    public Money plus(Money added) {
        
        int newEuros = 0;
        int newCents = 0;
        
        newEuros = this.euros + added.euros;
        newCents = this.cents + added.cents;
        
        Money newMoney = new Money(newEuros, newCents);
        
        return newMoney;
        
    }
    
    public boolean less(Money compared) {
        if (this.euros > compared.euros) {
            return false;
        } else if (this.euros == compared.euros) {
            if ( this.cents > compared.cents ) {
                return false;
            }
        }
        
        return true;
                    
        
    }
    
    public Money minus(Money decremented) {
        
        int newEuros = 0;
        int newCents = 0;
        
        newEuros = this.euros - decremented.euros;
        newCents = this.cents - decremented.cents;
        
        if (newCents < 0) {
            newEuros -= Math.abs(newCents / 100) + 1;
            newCents = (newCents % 100) + 100;
        }
        
        if (newEuros < 0) {
            newEuros = 0;
            newCents = 0;
        }
        
        Money newMoney = new Money(newEuros, newCents);
        
        return newMoney;
        
    }

}
