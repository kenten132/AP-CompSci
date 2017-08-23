/*
 * Grocery Store program. Calculates price of an item based on cost per pound 
 * and the item's weight multiplied by the sales tax.
 */

/**
 *
 * @author corbinhiggs
 */

package proj;

import javax.swing.JOptionPane;

public class GroceryStore {
    public static void main(String[] args){
        //variables
        double poundsOfItems;
        double pricePerPound;
        double salesTax;
        double totalCost;
        
        
        poundsOfItems = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the total pounds needed."));
        
        pricePerPound = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the price per pound."));
        //adds a sales tax function. 
        salesTax = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the sales tax rate ('%___')"));
        //calculations.
        
        //divides salesTax by 100 to get the true percentage.
        salesTax /= 100;
        totalCost = poundsOfItems * pricePerPound;
        
        //adds sales tax rate to the total cost, making totalCost = salesTax * totalCost (cost of tax) + totalCost (price subtotal)
        totalCost = (totalCost * salesTax) + totalCost;
        
        //outputting results.
        JOptionPane.showMessageDialog(null, 
                "\nGrocery Store Program\n\n"
                + "The toal pounds of item needed: " + poundsOfItems
                + "\n Price per pound of item: $" + pricePerPound
                /* Adds the sales tax percentage to the final output.*/
                + "\n Sales tax: %" + salesTax*100
                + "\nTotal Cost of Item: $" + totalCost);
        System.exit(0);
    }
}
