// i  do not think  ye program shi se likha g=hai maine kyuki no smjh aa rha hai mujhe khud ko 
public class duplicate_value_in_array {
    public static int find_duplicate(int arr[]){
        int count = 0;
        boolean dup =false;
        for (int i= 1 ; i<arr.length; i++ ){
            for(int j=i; j<arr.length;j++){
                if(arr[i] == arr[j]){
                    System.out.println("TRUE"+"The Duplicacte VAlues is "+arr[i]);
            
                }
                else{
                    System.out.println("No Duplicate found");
                }
 
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,2,1,5};
        find_duplicate(arr);
    }
}
