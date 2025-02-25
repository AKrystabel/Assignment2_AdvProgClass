/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment2;

/**
 *
 * @author anastasia
 */

import java.util.Scanner;
public class UseInsurance {
    
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 for Life Insurance or 2 for Health Insurance: ");
        int insurance = scanner.nextInt();
        
        do{
            if (insurance == 1){
                System.out.println("Enter the premium for life insurance: ");
                Life life = new Life(scanner.nextDouble());
                life.setCost();
                life.display();
                break;
            }else if(insurance == 2){
                System.out.println("Enter the premium for Health insurance: ");
                Health health = new Health(scanner.nextDouble());
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
