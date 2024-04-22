/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ecommercesystem;

import java.util.Scanner;
public class EcommerceSystem {

    public static void main(String[] args){
        Scanner input=new Scanner (System.in);
       System.out.print("enter your name:");
       String n=input.next();
       System.out.print("enter your id:");
       int id=input.nextInt();
       System.out.print("enter your address:");
       String add=input.next();
       Customer cu1=new Customer();
       cu1.setname(n);
       cu1.setaddress(add);
       cu1.setcustomerId(id);
        System.out.println("How many products do you want to add to the cart?");
        int nPr = input.nextInt();
        int x=cu1.getcustomerId();
       Cart cart1=new Cart(x,nPr);
       for (int i = 0; i < nPr; i++) {
            System.out.println("which one would you like to add (1 for smartphone, 2 for T-shirt, 3 for OOP)?");
            int productType = input.nextInt();
            switch (productType) {
                case 1:
                    ElectronicProduct e1 = new ElectronicProduct(1,"smart phone",599.9,"samsong",1);
                    cart1.addProduct(e1,i);
                    break;
                case 2:
                     ClothingProduct c1 = new ClothingProduct(2,"t-shirt",19.99,"Medium","cotton");
                    cart1.addProduct(c1,i);
                    break;
                case 3:
                    BookProduct b1 = new BookProduct(3,"oop",39.99,"o.Reiley","xpublications");
                    cart1.addProduct(b1,i);
                    break;
                default:
                    System.out.println("Invalid product type!");
                    break;
            }
            
        }
        System.out.println("Do you want to place an order for the products in the cart? (1-yes 2-no)");
        int choice = input.nextInt();
        if (choice==1){
         cart1.placeorder();

         Order order=new Order(x,1,cart1.getproducts());
         order.printOrderInfo();
        }
        else if(choice==2){
            System.out.println("Order has been cancelled");
        }
        else{
            System.out.println("wrong input please choose 1 or 2");
           
        }
    }
    
}
