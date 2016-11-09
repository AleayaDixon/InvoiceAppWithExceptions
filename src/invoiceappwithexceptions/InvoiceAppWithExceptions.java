/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invoiceappwithexceptions;
import java.util.Scanner;
import java.lang.*;

/**
 *
 * @author Aleaya
 */
public class InvoiceAppWithExceptions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Insert the tax as a decimal");
        double tax = keyboard.nextDouble();
        System.out.println("Insert a price. Insert 0.0 when all prices have been entered");
        //declare the array of a set size
        double myPrices[] = new double[100];
       //add prices to array. 
        //Use a counter to keep track of how many items are in your array.
        int counter = 1;
        double price = keyboard.nextDouble(); 
        
        double sum = 0.0;
       
        while(price != 0.0)
        {
            try
            {
            sum = sum + price;
            myPrices[counter] = price;
            counter +=1;
            System.out.println("Insert a price. Insert 0.0 when all prices have been entered");
            price = keyboard.nextDouble();
            //myPrices[counter] = price;
            //counter +=1;
            }catch(ArrayStoreException e)
            {
                System.out.println("This array element is an incompatible type");
            }catch (UnsupportedOperationException e)
		{
			System.out.println("An unsupported operation was encountered.");
		}catch (Exception e)
		{
		    System.out.println("Something else went wrong");
		}
            
            
        }
        double tot = (sum * tax) + sum;
        System.out.println("The tax rate is: " + tax);
        for (int i=1;i <counter; i++){

                System.out.printf("Price " + i + ": %.02f\n",myPrices[i]);
            }
        System.out.println("The total is " + tot);
    }
    
}
