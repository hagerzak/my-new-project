/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecommercesystem;
public class Product {
     protected int productId;
   protected String name;
  protected double price;
  public Product(){
      
  }
    public Product(int productId,String name,double price) {
     this.productId=Math.abs(productId);
     this.price=Math.abs(price);
     this.name=name;
}  
    public void setproductid(int productId){
           this.productId=Math.abs(productId); 
    }
    public void setname(String name){
        this.name=name;
    }
    public void setprice(double price){
        if (price<0){
          this.price=Math.abs(price);
        }
        else{
            this.price=price;
        }
    }
     public String getname(){
        return name;
    }
      public int getproductId(){
        return productId;
    }
      public double getprice(){
        return price;
    }
}
