package if_else;
import java.util.*;
public class check_for_vowel_constant {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.println("please enter a character");
       char ch = sc.next().charAt(0);
       ch= Character.toLowerCase(ch);
       if(ch=='a' || ch =='e'||ch=='i' ||ch=='o' ||ch=='u'){
        System.out.println(" the cahracter is a vowel");
       }
      else{
        System.out.println("its a consonant");
      }



       sc.close();
    }
}
