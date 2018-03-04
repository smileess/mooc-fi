
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author seankeever
 */
public class Storehouse {
    
    private Map<String, Integer> prices = new HashMap<String, Integer>();
    private Map<String, Integer> stocks = new HashMap<String, Integer>();
    
    
    public void addProduct(String product, int price, int stock) {
        prices.put(product, price);
        stocks.put(product, stock);
        
    }
    
    public int price(String product) {
        if (prices.get(product) == null) {
            return -99;
        }
        return prices.get(product);
    }
    
    public int stock(String product) {
        if (stocks.get(product) == null) {
            return 0;
        }
        return stocks.get(product);
    }
    
    public boolean take(String product) {
        if (stocks.get(product) == null) {
            return false;
        }
        
        if (stocks.get(product) > 0) {
            int oldValue = stocks.get(product);
            stocks.replace(product, oldValue - 1);
            return true;
        }
        
        return false;
    }
    
    public Set<String> products() {
        Set<String> set = new HashSet<String>();
        for (String product : stocks.keySet()) {
            set.add(product);
        }
        return set;
    }
    
}
