/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author arnol
 */
//Create an abstract class named Book. Include a String field for the book’s title and a double field for the book’s price. 
//Within the class, include a constructor that requires the book title, and add two get methods—one
//that returns the title and one that returns the price. Include an abstract method named setPrice(). 
//Create two child classes of Book: Fiction and NonFiction. Each must include a setPrice() method that sets the price for
//all Fiction Books to R 24.99 and for all NonFiction Books to R 37.99. 
//Write a constructor for each subclass, and include a call to setPrice() within each. 
//Write an application demonstrating that you can create both a Fiction and a NonFiction Book, 
//and display their fields. Save the files as Book.java, Fiction.java, NonFiction.java, and UseBook.java.

//Create an abstract class named Book. Include a String field for the book’s title and a double field for the book’s price. 
//Within the class, include a constructor that requires the book title, and add two get methods—one
//that returns the title and one that returns the price. Include an abstract method named setPrice(). 
abstract class Book {
    private String title;
    protected double price;
    public Book(String title) {
        this.title = title;
    }
    // returns the title
    public String getTitle() {
        return title;
    }
    // returns the price
    public double getPrice() {
        return price;
    }
    public abstract void setPrice();
}





