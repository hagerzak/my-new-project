/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecommercesystem;

public class Order {
    private int customerId;
    private int orderId;
    private Product[] products;
    private float totalPrice;
private float calculateTotalPrice() {
        float totalPrice = 0;
        for (int k=0;k<products.length;k++) {
            totalPrice += products[k].getprice();
        }
        return totalPrice;
}
    public Order(int customerId, int orderId, Product[] products) {
        this.customerId = Math.abs(customerId);
        this.orderId = Math.abs(orderId);
        this.products = products;
        this.totalPrice = calculateTotalPrice();
    }

    public void printOrderInfo() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer ID: " + customerId);
        System.out.println("Products:");
        for (int y=0;y<products.length;y++) {
            System.out.println("- " + products[y].getname() + ": " + products[y].getprice());
        }
        System.out.println("Total Price: " + totalPrice);
    }

    
}
    
    

