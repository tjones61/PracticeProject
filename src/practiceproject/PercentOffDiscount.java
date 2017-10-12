/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practiceproject;

/**
 *
 * @author tjones61
 */
public class PercentOffDiscount implements Discount {
    private double percentOff;
    
    public PercentOffDiscount(double percentOff) {
        this.percentOff = percentOff;
    }
    
    public double getDiscountAmt(double unitCost, int qty) {
        return unitCost * qty * percentOff;
    }
}
