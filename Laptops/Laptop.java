package Laptops;

public class Laptop {
    private String model;
    private int RAM;
    private int valueHDD;
    private String OS;
    private String color;

    public Laptop(String model, int RAM, int valueHDD, String OS, String color) {
        this.model = model;
        this.RAM = RAM;
        this.valueHDD = valueHDD;
        this.OS = OS;
        this.color = color;
    }

    // Методы возвращают значения полей класса
    public String getModel() {
        return model;
    }
    public int getRAM() {
        return RAM;
    }
    public int getValueHDD() {
        return valueHDD;
    }
    public String getOS() {
        return OS;
    }
    public String getColor() {
        return color;
    }

    // Методы задают значения полей класса
    public void setModel(String model) {
        this.model = model;
    }
    public void setRAM(int rAM) {
        RAM = rAM;
    }
    public void setValueHDD(int valueHDD) {
        this.valueHDD = valueHDD;
    }
    public void setOS(String oS) {
        OS = oS;
    }
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Модель: " + model + "; ОЗУ: " + RAM + "; Объем HDD: " 
        + valueHDD + "; ОС: " + OS + "; Цвет: " + color + ".";
    }

}
