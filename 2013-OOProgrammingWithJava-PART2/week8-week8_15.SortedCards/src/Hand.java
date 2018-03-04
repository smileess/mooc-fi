
import java.util.ArrayList;
import java.util.Collections;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author seankeever
 */
public class Hand implements Comparable<Hand> {
    
    private ArrayList<Card> hand = new ArrayList<Card>();
    
    public void add(Card card) {
        hand.add(card);

    }
    
    public void print() {
        for (Card card : hand) {
            System.out.println(card);
        }
    }
    
    public void sort() {
        Collections.sort(hand);
    }
    
    public int compareTo(Hand other) {
        int myHand = 0;
        for (Card card : hand) {
            myHand += card.getValue();
        }
        int otherHand = 0;
        for (Card card : other.hand) { // gross. should have made a method instead 
                                       // of duplicating code.
            otherHand += card.getValue();
        }
        return myHand - otherHand;
    }
    
    public void sortAgainstSuit() {
        Collections.sort(hand, new SortAgainstSuitAndValue());
        
    }
    
}
