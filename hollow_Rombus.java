import java.util.*;
public class hollow_Rombus {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        // outer loop
        for(int i = 1;i<=row;i++){
            //inner loop for spaces
            for(int j=1;j<=(row-i); j++){
                System.out.print(" ");
            }
            // stars
            for(int j=1 ; j<=col;j++){
                if(i==1 || i==row|| j==1 || j== col){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }

            }
            System.out.println(" ");
        }
        sc.close();
    }
}
