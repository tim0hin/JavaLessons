package OOP.Sem1;

import java.util.LinkedList;

/**
 * Торговый автомат, содержащий методы загрузки и выдачи товаров.
 */
public interface VendingMachine {
    
    public void putProduct(LinkedList<Product> item);

    public Product getProduct();

}
