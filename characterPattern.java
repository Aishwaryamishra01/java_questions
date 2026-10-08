import java.util.*;
public class characterPattern {
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter num of lines");

       int n = sc.nextInt();
         
       char ch = 'A';
         for(int row=1 ; row<=n ; row++){
            for( int chars = 1; chars<=row; chars++){
                System.out.print(ch);
                ch++;
            }
            System.out.println(" ");
         }
sc.close();
     }
}
