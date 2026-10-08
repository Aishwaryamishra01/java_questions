package if_else;

import java.util.*;
public class number_is_positive_negative_or_zero {
    public static void main (String[] args){
         Scanner sc = new Scanner(System.in);
         System.out.println("enter the number    "     );
         int num = sc.nextInt();
         if(num>0){
            System.out.println("number is a positive number");
         }
         else if(num==0){
            System.out.println("the given number is Zero");

         }
         else if(num<0){
            System.out.println("Thhe given number is negative");
         }
         else{
            System.out.println("enter a valid integer number");
     
         }
         sc.close();
    }
}
