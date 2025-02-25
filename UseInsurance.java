/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment2;

/**
 *
 * @author anastasia
 */

// importing scanner to allow reading user input
import java.util.Scanner;
public class UseInsurance {
    
    public static void main(String[] args){
        
        //creating a new scanner object which will then read user input for
        // the insurance type, and it is stored to insurance variable
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 for Life Insurance or 2 for Health Insurance: ");
        int insurance = scanner.nextInt();
        
        // this loop will execute for as long as the user input is none of the given
        // choices (1 for Life, 2 for Health). If it is either 1 or 2, it will then be
        // checked using the conditional statement. If the user inputs 1, it will 
        // creates life object and ask for the the premium for life insurance.
        // it will then calculate the cost from the premium input and call
        // for the display() method defined in the class. It will then exit the loop.
        // It is the same process again for when the user enter 2 (Health insurance).
        
        do{
            if (insurance == 1){
                Life life = new Life(scanner.nextDouble());
                System.out.println("Enter the premium for life insurance: ");
                life.setCost();
                life.display();
                break;
            }else if(insurance == 2){
                Health health = new Health(scanner.nextDouble());
                System.out.println("Enter the premium for Health insurance: ");
                health.setCost();
                health.display();
                break;
            }else{
                System.out.println("Please enter a valid number");
                insurance = scanner.nextInt();
            }
        }while(insurance !=1 || insurance !=2);
    }
    
}
