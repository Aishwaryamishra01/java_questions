package if_else;
// to check wheather a character is upper case or lower case
import java.util.*;
public class char_upper_lower_check {
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the character");
     char ch = sc.next().charAt(0);
     if(Character.isUpperCase(ch)){
        System.out.println("the cahracter is a uppercase character");
     }else if (Character.isLowerCase(ch)){
        System.out.println("the character is lowercase");

     }else{
        System.out.println(" Not a valid character ");
     }
     sc.close();
    }
}
