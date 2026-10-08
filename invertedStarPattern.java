import java.util.*;
public class invertedStarPattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of the rows");
        int n = sc.nextInt();
        for (int line = 1 ; line<=n ; line++){
            for(int column = n ;column>=  line ; column--){
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
        sc.close();
    }
}
