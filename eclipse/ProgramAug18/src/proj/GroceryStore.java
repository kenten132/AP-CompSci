/*
 * Grocery Store program. Calculates price of an item based on cost per pound 
 * and the item's weight
 */
package proj;

import javax.swing.JOptionPane;
/**
 *
 * @author corbinhiggs
 */
public class GroceryStore {
    public static void main(String[] args){
        //variables
        double poundsOfItems;
        double pricePerPound;
        double salesTax;
        double totalCost;
        
        
        poundsOfItems = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the total pounds needed."));
        
        pricePerPound = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the price per pound."));
        
        salesTax = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the sales tax rate ('0.__')"));
        //calculations.
        totalCost = poundsOfItems * pricePerPound;
        totalCost = (totalCost * salesTax) + totalCost;
        
        //outputting results.
        JOptionPane.showMessageDialog(null, "\nGrocery Store Program\n\n"
                + "The toal pounds of item needed: " + poundsOfItems
                + "\n Price per pound of item: $" + pricePerPound
                + "\n Sales tax: %" + salesTax
                + "\nTotal Cost of Item: $" + totalCost);
        System.exit(0);
    }
}
