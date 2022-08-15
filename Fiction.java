/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author arnol
 */
//Create two child classes of Book: Fiction and NonFiction. Each must include a setPrice() method that sets the price for
//all Fiction Books to R 24.99 and for all NonFiction Books to R 37.99. 
//Write a constructor for each subclass, and include a call to setPrice() within each. 
class Fiction extends Book {
    public Fiction(String title) {
        super(title);
    }
    @Override
    public void setPrice() {
        price = 24.99;
    }
}