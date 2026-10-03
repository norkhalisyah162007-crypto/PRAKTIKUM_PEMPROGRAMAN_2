package module02.problem01;

public class Fruit {
    private String fruitName;
    private float weight;
    private float price;
    private float quantity;
    private double pricePerKg;

    public Fruit(String fruitName, float weight, float price, float quantity) {
        this.fruitName = fruitName;
        this.weight = weight;
        this.price = price;
        this.quantity = quantity;

        this.pricePerKg = this.price / this.weight;

    }
    public void printInfo() {
        System.out.println("Nama Buah: "+ fruitName);
        System.out.println("Berat: "+ weight);
        System.out.println("Harga: "+ price);
        System.out.println("Jumlah Beli: "+ quantity +"kg");
        System.out.printf("Harga Sebelum Diskon: Rp%.2f%n", getPreDiscountPrice());
        System.out.printf("Total Diskon: Rp%.2f%n", getDiscountTotal());
        System.out.printf("Harga Setelah Diskon: Rp%.2f%n", getPostDiscountPrice());
        System.out.println(" ");
    }

    public double getPreDiscountPrice() {
        return (quantity/weight) * price;
    }

    public double getDiscountTotal() {
        int discountThresholdKg = 4;
        double discountPercentage = 0.02;

        int discountBatches = (int)(this.quantity / discountThresholdKg);
        return discountBatches * (this.pricePerKg * discountThresholdKg) * discountPercentage;
    }

    public double getPostDiscountPrice() {
        return getPreDiscountPrice() - getDiscountTotal();
    }
}