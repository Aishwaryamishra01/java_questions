   import java.util.*;
    public class I_shaped_pattern {
     public static void main(String[] args  ){
       Scanner sc = new Scanner(System.in);
       System.out.println("enter a number");
       double index = sc.nextDouble();
       double mid = Math.ceil(index/2);
       for(int i=1;i<=index; i++){
        for(int j=1;j<=index;j++){
            if(i==1||i==index||j==mid){
                System.out.print("* ");
            } else{
                System.out.print("  ");
            }
        }
       System.out.println(" ");
       }
       sc.close();
  
    }

}
