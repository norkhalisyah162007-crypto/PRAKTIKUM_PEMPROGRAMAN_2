package module02.problem02;

import java.util.Locale;

public class Coffee {
    private String name;
    private String size;
    private float price;
    private String customer;

    public void printInfo() {
        System.out.println("Nama Kopi: "+ name);
        System.out.println("Ukuran: "+ size);
        System.out.println("Harga: Rp. "+ price);
    }

    public void setName(String newName){
        this.name = newName;
    }

    public void setSize(String newSize){
        this.size = newSize;
    }

    public void setPrice(float newPrice){
        this.price = newPrice;
    }

    public void setCustomer(String newCustomer){
        this.customer = newCustomer;
    }

    public String getCustomer(){
        return customer;
    }

    public double getTax(){
        return ((double)11/100) * price;
    }
}