/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference.comparator;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import reference.domain.Film;
import reference.domain.Rating;

/**
 *
 * @author seankeever
 */
public class FilmComparator implements Comparator<Film> {

    private Map<Film, List<Rating>> ratings;

    public FilmComparator(Map<Film, List<Rating>> ratings) {
        this.ratings = ratings;

    }

    @Override
    public int compare(Film o1, Film o2) {
        List<Rating> list1 = ratings.get(o1);
        List<Rating> list2 = ratings.get(o2);
        return average(list2) - average(list1);

    }

    private int average(List<Rating> list) {
        int sum = 0;
        try {
            for (Rating rating : list) {
                sum += rating.getValue(); 
            }
            return sum / list.size();

        } catch (Exception e) {
            return 0;
        }

    }
}
