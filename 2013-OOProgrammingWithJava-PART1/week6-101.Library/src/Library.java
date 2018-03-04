/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author seankeever
 */
import java.util.ArrayList;

public class Library {
    
    private ArrayList<Book> books;
    
    public Library() {
        
        this.books = new ArrayList<Book>();
    }
    
    public void addBook(Book newBook) {
        books.add(newBook);
    }
    
    public void printBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }
    
    public ArrayList<Book> searchByTitle(String title) {
        ArrayList<Book> byTitle = new ArrayList<Book>();
        
        for (Book book : books) {
            if (StringUtils.included(book.title(), title)) {
                byTitle.add(book);
            }
            
            
        }
        return byTitle;
    }
    
    public ArrayList<Book> searchByPublisher(String publisher) {
        ArrayList<Book> byPublisher = new ArrayList<Book>();
        
        for (Book book : books) {
            if (StringUtils.included(book.publisher(), publisher)) {
                byPublisher.add(book);
            }
        }
        return byPublisher;
    }
    
    public ArrayList<Book> searchByYear(int year) {
        ArrayList<Book> byYear = new ArrayList<Book>();
        
        for (Book book : books) {
            if (book.year() == year) {
                byYear.add(book);
            }
        }
        return byYear;
    }
  
    
}
