/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reader.criteria;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author seankeever
 */
public class AtLeastOne implements Criterion {
    
    private List<Criterion> criterion = new ArrayList<Criterion>();

    public AtLeastOne(Criterion... criterion) {
        this.criterion.addAll(Arrays.asList(criterion));
    }

    @Override
    public boolean complies(String line) {
        for (Criterion c : this.criterion) {
            if (c.complies(line)) {
                return true;
            }
        }
        return false;
    }
    
}
