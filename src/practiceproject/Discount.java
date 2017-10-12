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
public interface Discount {
    public abstract double getDiscountAmt(double unitCost, int qty);
}
