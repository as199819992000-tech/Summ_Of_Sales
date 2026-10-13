package app;

public class Main {
    public static void main(String[] args) {
        String productName;
        int quantity;
        double price;
        int days;
        double totalSales;
        double salesByDay;

        productName = "Smartphone";
        price = 305.99;
        quantity = 40;
        days = 5;
        totalSales = price * quantity;
        salesByDay = totalSales / days;
        System.out.printf("Product No 1: %s, total sales for %d days is EUR %.2f, sales by day is EUR %.2f.%n", productName, days, totalSales, salesByDay);
        productName = "Laptop";
        price = 570.95;
        quantity = 20;
        days = 7;
        totalSales = price * quantity;
        salesByDay = totalSales / days;
        System.out.printf("Product No 2: %s, total sales for %d days is EUR %.2f, sales by day is EUR %.2f.%n", productName, days, totalSales, salesByDay);
    }
}
