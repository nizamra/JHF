package BookCase;
import java.util.*;

public class Storage {
    private Book[] books;
    private int[] inStock;

    Storage(){}

    Storage(Book[] a, int[] b){
        this.books = a;
        this.inStock = b;
    }
    // •	addBook(Book newBook, int amount) – adds a books to the books array and adds the amount to inStock. Use System.arraycopy() when needed
    // •	rentBook(Book book)  : String  -  reduces inStock array and returns book name as approval or null if no books in stock (in stock = 0)
    // •	returnBook(Book book) – updates book in stock value
    // •	getInStock(Book book) : int – returns the current amount of the given book in stock
    
    public void addbook(Book newBook){
        this.books.add(newBook);
        this.inStock.add(1);
    }
    public void addbook(Book newBook, int amount){
        this.books.add(newBook);
        this.inStock.add(amount);
    }
    
    public void rentBook(Book book){
        this.books.remove(book);
    }
    
    public Book[] getBooks() {
        return books;
    }
    public void setBooks(Book[] books) {
        this.books = books;
    }
    public int[] getInStock() {
        return inStock;
    }
    public void setInStock(int[] inStock) {
        this.inStock = inStock;
    }
    
}
