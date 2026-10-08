
public class largtgest_number_in_the_array {
    public static int getLargest(int numbers[]){
        int largest=Integer.MIN_VALUE;  //-infinite
        int smallest = Integer.MAX_VALUE;//+infinite

        for(int i = 0;i<numbers.length; i++){
            if(largest < numbers[i]){
                largest = numbers[i]; 
            }
            if(smallest>numbers[i]){
                smallest = numbers[i];
            }
        }
        System.out.println("the smallest num is "+smallest);
        return largest;
    }
    public static void main(String[] args){
        int numbers[]={1,2,3,4,5,6,7};
        System.out.println("largest value is:-"+getLargest(numbers));
    }
}
