/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment2;

/**
 *
 * @author anastasia
 */

// insurance is the abstract class which can be said to be like the
// blueprint for other classes that extends from it. 
// it has the attributes and methods that the child class could 
// access and override
public abstract class Insurance {
    
    protected String type;
    protected double cost;
    protected double premium;
    
    public abstract void setCost();
    
    public abstract void display();
    
    
    
    
}
