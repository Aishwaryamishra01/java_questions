import java.util.* ;
public class inverted_half_pyramid_with_numbers {
    public static void main (String[] args ){
    Scanner input = new Scanner(System.in);
    int row = input.nextInt();
        for (int i = 1; i<=row; i++){
            for (int j = 1; j<=(row-i+1);j++){
                System.out.print(j+" ");
            }
            System.out.println("_");
        }
input.close();
    } 
}
