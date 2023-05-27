package OOP.Sem1;

import java.util.LinkedList;

/**
 * WaterVendingMachine
 */
public class WaterVendingMachine implements VendingMachine{
    private LinkedList<Product> waters;

    public void putProduct(LinkedList<Product> item){
        this.waters = item;
    }

    public Product getProduct(){
        return waters.pollLast();
    }
    
}