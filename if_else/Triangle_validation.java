package if_else;
import java.util.*;

public class Triangle_validation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three angles");
        double ang1 = sc.nextDouble();
        double ang2 = sc.nextDouble();
        double ang3 = sc.nextDouble();
        double sum = ang1 + ang2 + ang3;

        // Use tolerance for floating point comparison
        if (ang1 > 0.0 && ang2 > 0.0 && ang3 > 0.0 && Math.abs(sum - 180.0) < 0.0001) {
            System.out.println("It is a valid triangle");

            if (ang1 == 90.0|| ang2 == 90.0 || ang3 == 90.0) {
                System.out.println("The triangle is a Right Triangle");
            } else if (ang1 < 90.0 && ang2 < 90.0 && ang3 < 90.0) {
                System.out.println("The triangle is an Acute Triangle");
            } else if (ang1 > 90.0 || ang2 > 90.0 || ang3 > 90.0) {
                System.out.println("The triangle is an Obtuse Triangle");
            } else {
                System.out.println("Triangle type not defined");
            }
        } else {
            System.out.println("Not a valid triangle");
        }

        sc.close();
    }
}



// dekho possibility har ek basic cod e ke expansion ki hoti hai kaise is code bhi hum bade scale par le ja eakte hai jaise 
//1.. suppose useer sirf 2 angles hi input de 
//2. har type ke triangle define kar do 