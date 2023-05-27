package OOP.Sem1;

/**
 * Класс "Товар", содержащий данные о товаре
 */
public abstract class Product {
    protected String name;
    protected int price;

    // геттеры
    public abstract String getName();
    public abstract int getPrice();

    // сеттеры
    public abstract void setName(String name);
    public abstract void setPrice(int price);
   
}