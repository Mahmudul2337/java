package superstore;

import java.util.Scanner;

public class customar extends SuperClass{
   String CustomerType;
   float discount;
   
   public void Cinfo(){
       Scanner input2=new Scanner(System.in);
       System.out.print ("enter Customer type:");
       CustomerType=input2.nextLine();
       
       if(CustomerType.equalsIgnoreCase("member")){
           discount=(float)0.05;
       }
       else{
           discount=(float) 0.02;
       }
       System.out.println("discount is:"+discount);
   }   
}
