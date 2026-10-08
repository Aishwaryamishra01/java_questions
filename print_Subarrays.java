public class print_Subarrays {

    public static void sub_arrays(int arr[]){
        int ts = 0;
        
        for(int i=0 ; i<arr.length;i++){
            
           int start = i;
           for(int j=i ; j<arr.length; j++){
              int end = j; 
              int sum = 0;
              for(int k = start; k<=end ;  k++){
                 System.out.print(arr[k]+ "  "); 
                 sum+=arr[k];
              }  
              System.out.println("sum"+sum);
              System.out.println( );
              ts++;
            } 
            System.out.println( );
            
        }
         System.out.println(ts);
    }
    public static void main(String[] args){
        int arr[] = {2,4,6,8,10};
        sub_arrays(arr);
    }
}
