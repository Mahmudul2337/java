package superstore;

import java.util.Scanner;

public class SuperClass {
    
    int id;
    String name;
    String address;
    
    public void information(){
        Scanner input=new Scanner(System.in);
        System.out.print("enter id:");
        id=input.nextInt();
        System.out.print("enter name:");
        name=input.next();
        System.out.print("enter address:");
        address=input.next();
    }
    public void display1(){
        System.out.println("id number is:"+id);
        System.out.println("name is :"+name);
        System.out.println("address is :"+address);
    }
    
}
