import java.util.*;
public class solid_Rombus {
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       int n = input.nextInt();
       //outrt loop 
       for(int i=1; i<=n;i++){
        //spaces
        for(int j = 1 ; j<=n-i;j++){
            System.out.print("  ");
        }
        //stars 
        for(int j = 1 ; j<=n; j++){
            System.out.print("*");
        }
       
        System.out.println(" ");
       }
       input.close();
    }    
}
