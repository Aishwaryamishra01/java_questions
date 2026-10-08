import java.util.*;
public class linear_search_in_menu{
    public static int search_menu(String key , String menu[]){
     
        
        for(int i=0;i<menu.length;i++){
            if( key  == menu[i] ){
             
                System.out.println("the index of"+key +"is"+i);
        
            }
        }
    return -1;
    }
    public static void main(String[] args){
      String menu[] ={"jalebi","Samosa","papdi","golgappa","muradawadi dal","aloo chat"};
      for(int i =1; i<=menu.length;i++){
        System.out.println(menu[i]);
      } 


      Scanner sc = new Scanner(System.in);
      System.out.println("enter the food item to search:-");
      String key = sc.next();
      System.out.println(menu.length);
      search_menu(key,menu);
      sc.close();
    }

    
}
