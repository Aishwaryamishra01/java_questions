import java.util.*;
public class array {
    public static void operations(){ 
        int marks[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elemment of the array:");
        //input in array 
        for(int i =0;i<marks.length; i++){
            marks[i] =sc.nextInt();
        }
        System.out.println("The array you entered is :-");
        //output in array 
        for(int i=0;i<marks.length;i++){
            System.out.print(marks[i] +" ");
        }
        System.out.println( );
        //updation of the elements of the array
        System.out.println("the updated array is :-");
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]+1);
        }    
         sc.close();
      
    }
    public static int argument_array(int array[] ,int n){
        for(int i=0;i<array.length;i++){
            array[i]++;
        }
        n+=5;
        System.out.println("the non changelble element inside the fun :="+n);
          System.out.println("the array after function:-");
        for(int i = 0;i< array.length;i++){
        System.out.println(array[i]);
    }
    return 0;
    }
    public static void main(String[] args){
    //   operations();
      int arr[] ={1,2,3,4,5,6,7};
      int non_changeble =5;
      System.out.println("the aray without updation is :-");
      for(int i = 0;i<arr.length;i++){
        System.out.println(arr[i]);
      }
     argument_array( arr,non_changeble);
     System.out.println("non chanveble is not changes outside the fnction same as initialized "+ non_changeble);

    }

    
}
