/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author arnol
 */
//Write an application demonstrating that you can create both a Fiction and a NonFiction Book, 
//and display their fields.
public class UseBook {
    public static void main(String[] args) {
        Fiction Fiction = new Fiction("Kanye West becomes president");
        Fiction.setPrice();
        NonFiction NonFiction = new NonFiction("The Biography of Elon Musk");
        NonFiction.setPrice();
        
        System.out.println("Title of Fiction: " + Fiction.getTitle());
        System.out.println("Price: R" + Fiction.getPrice());
        System.out.println("Title of NonFiction: " + NonFiction.getTitle());
        System.out.println("Price: R" + NonFiction.getPrice());
    }
}