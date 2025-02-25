/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment2;

/**
 *
 * @author anastasia
 */
public class Health extends Insurance{
    
    // constructor that takes double pr as input
    // it is then set as premium, and the type to be Health
    public Health(double pr){
        this.premium = pr;
        this.type = "Health";
        
    }

    //overriding the setCost() method from the abstract class
    // where cost is calculated to be 5% (0.05) of the premium
    @Override
    public void setCost() {
        this.cost = 0.05 * this.premium;
    }
    
    // display() method which is also overriden from the abstract class
    // prints out the type of insurance and the cost per month that is formatted
    // to show 2 decimal places
    @Override
    public void display() {
        System.out.printf("%s insurance costs $%.2f per month\n",type,cost);
    }
    
}
