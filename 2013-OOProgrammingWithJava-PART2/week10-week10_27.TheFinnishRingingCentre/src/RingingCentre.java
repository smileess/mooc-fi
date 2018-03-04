
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
public class RingingCentre {

    private Map<Bird, List<String>> centre;

    public RingingCentre() {

        this.centre = new HashMap<Bird, List<String>>();
    }

    public void observe(Bird bird, String place) {
        
        if (centre.containsKey(bird)) {
            centre.get(bird).add(place);
        } else {
            centre.put(bird, new ArrayList<String>());
            centre.get(bird).add(place);
        }
    }


    public void observations(Bird bird) {
        
        System.out.println(bird + " observations: " + getObservations(bird));

        if (centre.containsKey(bird)) {
            for (String place : centre.get(bird)) {
            System.out.println(place);
            }
        }
        
        
        

    }
    
    private int getObservations(Bird bird) {

        if (centre.containsKey(bird)) {
            return centre.get(bird).size();
        } else {
            return 0;
        }
    }

    private void printObservations(Bird bird) {
        List<String> places = centre.get(bird);
        System.out.println(bird + " observations: " + places.size());
        for (String place : places) {
            if (place != null) {
                System.out.println(place);
            }
            
        }
    }


}
