/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecommercesystem;


public class ClothingProduct extends Product {
    private String size;
   private String fabric;
   public ClothingProduct(){
       
   }
   public ClothingProduct(int productId,String name,double price,String size,String fabric){
       super(productId,name,price);
       this.size=size;
       this.fabric=fabric;
   }
   
    public void setsize(String size){
        this.size=size;
    }
    public void setfabric(String fabric){
        this.fabric=fabric;
    }
    public String getsize(){
        return size;
    }
    public String getfabric(){
        return fabric;
    }
}
