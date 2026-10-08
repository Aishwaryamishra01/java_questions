import java.util.Scanner;
public class EvenPairsPattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        for(int i=1; i<=rows; i++){
            // हर दो rows पर stars बढ़ते हैं
            int stars = ((i+1)/2) * 2;  // formula: 2,2,4,4,6,6,...
            for(int j=1; j<=stars; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}