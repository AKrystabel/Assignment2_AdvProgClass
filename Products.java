/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment2;

/**
 *
 * @author anastasia
 */
public class Products {
    
    //setting the members of Products to be private
    private String name;
    private float price;
    
    // setName method to set the name
    public void setName(String name){
        this.name = name;
    }
    
    //setPrice method to set the price
    public void setPrice(float price){
        this.price = price;
    }
    
    //getName method to get the name of the product
    public String getName(){
        return this.name;
    }
    
    //getPrice method to get the price of the product
    public float getPrice(){
        return this.price;
    }
}
