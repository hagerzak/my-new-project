/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecommercesystem;



public class ElectronicProduct extends Product {
   private String brand;
  private int warrantyPeriod;
  public ElectronicProduct(){
      
  }
   public ElectronicProduct(int productId,String name,double price,String brand,int warrantyPeriod){
    super(productId,name,price);
     this.warrantyPeriod=Math.abs(warrantyPeriod);
     this.brand=brand;
  }
  public void setwarrantyPeriod(int warrantyPeriod){
        
           this.warrantyPeriod=Math.abs(warrantyPeriod);
    }
    public void setbrand(String brand){
        this.brand=brand;
    }
    public String getbrand(){
        return brand;
    }
    public int getwarrantyPeriod(){
        return warrantyPeriod;
    }
}
