
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author seankeever
 */
public class ShoppingBasket {
    
    private Map<String, Purchase> basket = new HashMap<String, Purchase>();
    
    public void add(String product, int price) {
        if (basket.containsKey(product)) {
            Purchase purchase = basket.get(product);
            purchase.increaseAmount();
            basket.put(product, purchase);
        } else {
            basket.put(product, new Purchase(product, 1, price));
        }
        
    }
    
    public int price() {
        int totalPrice = 0;
        for (Purchase purchase : basket.values()) {
            totalPrice += purchase.price();
        }
        return totalPrice;
    }
    
    public void print() {
        for (Purchase purchase : basket.values()) {
            System.out.println(purchase);
        }
    }
    
}
