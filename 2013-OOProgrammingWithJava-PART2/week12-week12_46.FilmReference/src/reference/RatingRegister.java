/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import reference.domain.Film;
import reference.domain.Person;
import reference.domain.Rating;

/**
 *
 * @author seankeever
 */
public class RatingRegister {

    private Map<Film, List<Rating>> filmRatings = new HashMap<Film, List<Rating>>();
    private Map<Person, Map<Film, Rating>> people = new HashMap<Person, Map<Film, Rating>>();

    public void addRating(Film film, Rating rating) {

        if (!filmRatings.containsKey(film)) {
            List<Rating> r = new ArrayList<Rating>();
            r.add(rating);
            filmRatings.put(film, r);
        } else {
            List<Rating> r = filmRatings.get(film);
            r.add(rating);
            filmRatings.put(film, r);
        }

    }

    public List<Rating> getRatings(Film film) {
        return filmRatings.get(film);

    }

    public Map<Film, List<Rating>> filmRatings() {
        return filmRatings;
    }

    public void addRating(Person person, Film film, Rating rating) {
        addRating(film, rating);
        if (people.get(person) == null) {
            Map<Film, Rating> m = new HashMap<Film, Rating>();
            m.put(film, rating);
            people.put(person, m);
        } else {
            Map<Film, Rating> m = getPersonalRatings(person);
            m.put(film, rating);
            people.put(person, m);
        }
        

    }

    public Rating getRating(Person person, Film film) {
        Map<Film, Rating> m = getPersonalRatings(person);
        for (Film f : m.keySet()) {
            if (f.equals(film)) {
                return m.get(f);
            }
        }
        return Rating.NOT_WATCHED;
    }

    public Map<Film, Rating> getPersonalRatings(Person person) {
        if (people.get(person) != null) {
            return people.get(person);
        } else {
            return Collections.EMPTY_MAP;
        }
        
        
        

    }

    public List<Person> reviewers() {
        List<Person> l = new ArrayList<Person>();
        for (Person person : people.keySet()) {
            l.add(person);
        }
        return l;

    }

    public Map<Person, Map<Film, Rating>> getPersonalRatings() {
        return people;
    }
    
    
}
