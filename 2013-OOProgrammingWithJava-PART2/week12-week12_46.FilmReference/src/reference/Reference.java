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
import reference.comparator.FilmComparator;
import reference.comparator.PersonComparator;
import reference.domain.Film;
import reference.domain.Person;
import reference.domain.Rating;

/**
 *
 * @author seankeever
 */
public class Reference {

    private RatingRegister register;


    public Reference(RatingRegister register) {
        this.register = register;
    }

    public Film recommendFilm(Person p) {
        // needs to change to new data type map< person , filmrating >
        
        try {
            return getBestFilm(p);
        } catch (Exception e) {
            return getGeneralBestFilm(p);
        }

    }
    
    private Person findMostSimilarPerson(Map<Person, Integer> similarities) {

        List<Person> people = new ArrayList<Person>();
        
        for (Person person : similarities.keySet()) {
            people.add(person);
        }
        
        Collections.sort(people, new PersonComparator(similarities));
        
        if (!people.isEmpty()) {
            return people.get(1);
        } else {
            return null;
        }

    }
    
    private Film getBestFilm(Person ourPerson) {
        
        Map<Film, List<Rating>> filmData = new HashMap<Film, List<Rating>>();
        Map<Person, Integer> similarities = new HashMap<Person, Integer>();

        for (Map.Entry<Person, Map<Film, Rating>> data : register.getPersonalRatings().entrySet()) {
            
            Person person = data.getKey();
            Map<Film, Rating> filmRating = data.getValue();
            
            int similarity = 0;
            
            for (Map.Entry<Film, Rating> fR : filmRating.entrySet()) {
                Film film = fR.getKey();
                Rating rating = fR.getValue();
                
                if (register.getPersonalRatings(ourPerson).containsKey(film)) {
                    similarity += rating.getValue() *
                            register.getPersonalRatings(ourPerson).get(film).getValue();
                }
                
                if (!filmData.containsKey(film)) {
                    List<Rating> listOfRatings = new ArrayList<Rating>();
                    listOfRatings.add(rating);
                    filmData.put(film, listOfRatings);
                } else {
                    List<Rating> listOfRatings = filmData.get(film);
                    listOfRatings.add(rating);
                    filmData.put(film, listOfRatings);
                }
                
            }
            
            similarities.put(person, similarity);
 
        }
        
        Person mostSimilarPerson = findMostSimilarPerson(similarities);
        
        Film mostSimilarFilm = findMostSimilarFilm(ourPerson, mostSimilarPerson, filmData);

        if (mostSimilarFilm != null) {
            return mostSimilarFilm;
        } else {
            return getGeneralBestFilm(ourPerson);
        }
        
        
    }
    
    private Film findMostSimilarFilm(Person ourPerson, Person mostSimilarPerson,
            Map<Film, List<Rating>> filmData) {
        
        List<Film> listOfFilms = new ArrayList<Film>();
        
        for (Film film : register.getPersonalRatings().get(mostSimilarPerson).keySet()) {
            if (register.getPersonalRatings().get(mostSimilarPerson).get(film).getValue() > 1) {
                listOfFilms.add(film);
            }
        }
        
        Collections.sort(listOfFilms, new FilmComparator(filmData));
        
        for (Film film : listOfFilms) {
            if (!register.getPersonalRatings().get(ourPerson).containsKey(film)) {
                return film;
            }
        }
        
        return null;
        
        
    }
    
    private Film getGeneralBestFilm(Person ourPerson) {
        
        Map<Film, List<Rating>> allRatings = register.filmRatings();
        
        List<Film> allFilms = new ArrayList<Film>();
        
        for (Film film : register.filmRatings().keySet()) {
            allFilms.add(film);
        }
        
        Collections.sort(allFilms, new FilmComparator(allRatings));
        
        for (Film film : allFilms) {
            if (!register.getPersonalRatings(ourPerson).containsKey(film)) {
                return film;
            }
        }
        
        return null;
        
    }

}
