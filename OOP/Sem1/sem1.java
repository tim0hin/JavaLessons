package OOP.Sem1;

import java.util.LinkedList;

public class sem1 {
    public static void main(String[] args) {
        WaterVendingMachine wvm = new WaterVendingMachine();

        Product bonAqua = new Water("bonAqua", 50);
        Product redKey = new Water("redKey", 60);

        LinkedList<Product> l = new LinkedList<>();
        l.add(bonAqua);
        l.add(redKey);
        
        wvm.putProduct(l);
        System.out.println(wvm.getProduct());
        System.out.println(wvm.getProduct());
        System.out.println(wvm.getProduct());
    }
}
