/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermarket;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;


/**
 *
 * @author evenal
 */
public class Checkout {
    // amount of time per product(to scan barcode)
    public static final int PROD_DURATION = 2;
    // amount of time to pay
    public static final int PAY_DURATION = 10;
    //total time for checkout = PAY_DURATION + PROD_DURATION*customer.numProd

    SuperMarket shop;
    String name;

    // que of customers
    Queue<Customer> tillQue;


    public Checkout(SuperMarket shop, int i) {
        this.shop = shop;
        this.name = "Checkout" + i;

        tillQue = new LinkedList<>();
    }

    public void enterQue(Customer c) {
        tillQue.add(c);
    }

    public void exitQue(Customer c) {
        tillQue.remove(c);
    }

    public int getQueLength(){
        return tillQue.size();
    }

    public void checkoutQue() {

    }

    public int checkoutDuration(Customer customer, int numWares) {
        int checkoutDuration = ((numWares * PROD_DURATION) + PAY_DURATION);
        return checkoutDuration;
    }

}
