import java.util.*;
public class koi_toh_new_type_ka_pattern_print {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int row = input.nextInt();
        int sum = 0;

        for(int i =1;i<=row ;i++){
            for(int j= 1; j<=i; j++){
             System.out.print((sum+j)+" ") ;
             sum = sum+j;
            }
            System.out.println(" ");
        }

       input.close();
    }
}
