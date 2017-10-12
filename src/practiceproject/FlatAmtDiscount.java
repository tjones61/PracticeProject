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
public class FlatAmtDiscount implements Discount {
    private double flatAmtDiscount;
    
    public FlatAmtDiscount(double flatAmtDiscount) {
        this.flatAmtDiscount = flatAmtDiscount;
    }
    
    public double getDiscountAmt(double unitCost, int qty) {
        return qty * flatAmtDiscount;
    }
    
 
}
