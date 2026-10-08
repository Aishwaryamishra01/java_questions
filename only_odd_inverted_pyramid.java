import java.util.*;
public class only_odd_inverted_pyramid{

    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the number of rows ");
       int row = sc.nextInt();
       for (int i = 1; i<=row; i++){
            if(i%2!=0){
                //spaces
                for(int j = 1;j<=i;j++){
                    System.out.print(" ");
                }
                // stars
                for(int j = 1;j<=(row-i+1);j++){
                    
                  System.out.print("* ");
                
                }
                System.out.println(" ");
            }else{
                continue;
            }
        }
        sc.close();
    }
}
