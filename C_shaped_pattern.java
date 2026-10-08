import java.util.*;
public class C_shaped_pattern {
     public static void main(String[] args  ){
       Scanner sc = new Scanner(System.in);
       System.out.println("enter index");
       int index = sc.nextInt();
       for(int i=1;i<=index; i++){
        for(int j=1;j<=index;j++){
            if(i==1||i==index||j==index){
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
