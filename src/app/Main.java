package app;

public class Main {
    public static void main(String[] args) {
        String productName;
        double price;
        int days;
        double totalSales;
        double salesByDay;

        productName = "Smartphone";
        price = 2430.68;
        days = 5;
        totalSales = price * days;
        salesByDay = totalSales / days;
        System.out.printf("Product No 1: %s, %n", productName);
        System.out.printf("total sales for %d days is EUR %.2f,%n",days, totalSales);
        System.out.printf("sales by day is EUR %.2f.%n", salesByDay);
        productName = "Laptop";
        price = 1498.12;
        days = 7;
        totalSales = price * days;
        salesByDay = totalSales / days;
        System.out.printf("Product No 2: %s, %n", productName);
        System.out.printf("total sales for %d days is EUR %.2f,%n",days, totalSales);
        System.out.printf("sales by day is EUR %.2f.%n", salesByDay);

    }
}
