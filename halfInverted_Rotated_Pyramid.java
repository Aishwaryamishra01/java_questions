import java.util.*;
public class halfInverted_Rotated_Pyramid {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        int row = input.nextInt();
      // outer loop for  rows 
        for (int i = 1 ; i <= row ; i++){
            //inner loop for columns specifically for spaces 
            for (int j = 1; j <= row-i; j++){
                System.out.print(" ");
            }
            // other inner loop specifically for stars
            for (int j=1 ; j<=i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        input.close();
    }
}
