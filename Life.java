/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment2;

/**
 *
 * @author anastasia
 */
public class Life extends Insurance{
   
    public Life(double pr){
        this.premium = pr;
        this.type = "Life";
        
    }

    @Override
    public void setCost() {
        this.cost = 0.02 * this.premium;
    }

    @Override
    public void display() {
        System.out.printf("%s insurance costs %.2f per month\n",type,cost);
    }
    
}
