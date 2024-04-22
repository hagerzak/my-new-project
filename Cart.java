/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecommercesystem;
import java.util.Scanner;
public class Cart {
   private int nProducts;
    private int customerId;
    private Product[] products=new Product [nProducts];
    public Cart(){
        
    }
    
    public Cart(int customerId,int nProducts ){
        this.nProducts=Math.abs(nProducts);
        this.customerId=Math.abs(customerId); 
        this.products=new Product[nProducts];
    }
     public void setcustomerId(int customerId){
        
           this.customerId=Math.abs(customerId);    
    }
     public void setnProducts(int nProducts){
        if (nProducts<=0){
           this.nProducts=Math.abs(nProducts);
        }
        else{
            this.nProducts=nProducts;
        }
      
    }
     public void setproducts(Product[] products){
    this.products =products;
}
      
       
      public void addProduct(Product pr,int i) {
          if (i < products.length) {
            products[i] = pr;
        }
    } 
      public void removeProduct(Product pr) {
    for (int i = 0; i < nProducts; i++) {
        if (products[i] != null && products[i].getproductId() == pr.getproductId()) {
            for (int j = i; j < nProducts - 1; j++) {
                products[j] = products[j + 1];
            }
            products[--nProducts] = null;
            break;
        }
    }
}
       public float calculatePrice() {
        float totalPrice = 0;
        for (int k=0;k<products.length;k++) {
            totalPrice += products[k].getprice();
        }
        return totalPrice;
    }
    
       public void placeorder() {
        System.out.println("the order has been placed \nhere is your order summary:");
    }
       public Product[] getproducts(){
           return products;
       }
       public int getcustomerId(){
        return customerId;
    }
       public int getnProducts(){
        return nProducts;
    }
}

