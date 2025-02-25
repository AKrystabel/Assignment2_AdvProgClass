/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment2;

/**
 *
 * @author anastasia
 */

// importing needed array list and scanner
import java.util.ArrayList;
import java.util.Scanner;

public class sortProducts {
    
    // creating a statice scanner object to read user input
    static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args){
        
        //arrat list creation that holds the list of products
        ArrayList<Products> product_list = new ArrayList<>();
        
        //initial question in asking if user wants to enter product and then
        // reading the user input
        System.out.println("Do you want to enter a product (y/n): ");
        String user_add_input = scanner.nextLine();
        
        
        // while the user enters 'y' or "yes" the loop will continue
        // the case is not a concern nor if it is a yes because the user input
        // is converted into lowercase for the whole thing, and only taking 
        // into account the first character (denoted with index 0)
        do{
            Products p = new Products();
            product_creating(p);
            product_list.add(p);
            System.out.println("Do you want to enter another product (y/n): ");
            scanner.nextLine();
            user_add_input = scanner.nextLine();
        }while(user_add_input.toLowerCase().charAt(0)=='y');
        
        
        // i holds the number of iteration of the whole loop
        // swapped is a boolean type and it is initialized to hold false (no swap)
        // j is the index of the array list that we are comparing to the next one
        // we are comparing the price of the product object at index j to the
        // price of the product object at index j+1. The if statement will only
        // execute when the price of product at index j is bigger than at index j+1.
        // When it executes, the object at index j will be stored to temp variable.
        // Then, the index j will be overwritten with the object at index j+1.
        // The object at index j+1 will then be set to hold the object in temp, and
        // swapped will now be set to true. The next if statement checks if swapped holds
        // false, and if so the loop breaks. If it was swapped, it has it set to 
        // true, which means the loop break will not occur, but instead loop back to 
        // the outer loop but now i holds the new value of i+1.
        for(int i = 0; i<product_list.size()-1; i++){
            boolean swapped = false;
            for (int j = 0; j < product_list.size() - i - 1; j++) {
                if (product_list.get(j).getPrice() > product_list.get(j + 1).getPrice()) {
                    
                    // Swap arr[j] and arr[j+1]
                    Products temp = product_list.get(j);
                    product_list.set(j,product_list.get(j+1));
                    product_list.set(j+1,temp);
                    swapped = true;
                }   
            }
            if (swapped == false){
                break;
            }
        }
        
        // once it breaks from the loop, it will execute the display_info method
        display_info(product_list);
    }

    public static void product_creating(Products p){
        System.out.println("Enter product: ");
        String name = scanner.nextLine();
        p.setName(name);
        System.out.println("Enter price: ");
        float price = scanner.nextFloat();
        p.setPrice(price);
    }
    
    public static void display_info(ArrayList<Products> array){
        System.out.println("This is the list");
        for(Products p : array){
            String name = p.getName();
            float price = p.getPrice();
            System.out.printf("Product %s is $%.2f\n",name,price);
        }
    }
    
    
}

