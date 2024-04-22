/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecommercesystem;

public class Customer {
    private int customerId;
 private String address;
 private String name;
 
public void setcustomerId(int customerId){
       
           this.customerId=Math.abs(customerId);   
    }
    public void setaddress(String address){
        this.address=address;
    }
    public void setname(String name){
        this.name=name;
    }
  
     public String getname(){
        return name;
    }
      public int getcustomerId(){
        return customerId;
    }
      public String getaddress(){
        return address;
    }
}
