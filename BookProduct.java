/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecommercesystem;



public class BookProduct extends Product {
    private String author;
    private String publisher;
    public BookProduct(){
        
    }
    public BookProduct(int productId,String name,double price,String author,String publisher){
        super(productId,name,price);
        this.author=author;
         this.publisher=publisher;
    }
    public void setauthor(String author){
        this.author=author;
    }
    public void setpublisher(String publisher){
        this.publisher=publisher;
    }
    public String getauthor(){
        return author;
    }
    public String getpublisher(){
        return publisher;
    }
}
