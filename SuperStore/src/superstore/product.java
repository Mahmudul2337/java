package superstore;
import java.util.Scanner;

public class product {  
   public String Pname;
   public  String quantity;
   public  int Pid;
    public int price;
    
    public void Pinfo(){
        Scanner input=new Scanner(System.in);
        
        System.out.print("Enter Product Name:");
         Pname=input.nextLine();
        System.out.print("Enter Product quantity:");
         quantity=input.nextLine();
        System.out.print("Enter Product Id:");
         Pid=input.nextInt();
         System.out.print("Enter product price:");
         price=input.nextInt();
           
    }   
    public void display(){
        System.out.println("product id is:"+Pid);
        System.out.println("Product Name :"+Pname);
        System.out.println("Product Quality :"+quantity);
        System.out.println("Product Price is :"+price);
    }
    
}
