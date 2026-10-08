import java.util.*;

public class dimond_pattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //upper half
        for(int i = 1;i<=n;i++){
            //spaces
            for(int j=1; j<=n-i;j++){
                System.err.print(" ");
            }
            // stars
            for(int j= 1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        //Mirror image (lower half)
        for(int i =n;i>=1;i--){
            //spaces 
            for(int j=1; j<=n-i;j++){
                System.err.print(" ");
            }
            //star 
            for(int j= 1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        sc.close();
    }
}
