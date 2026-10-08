public class MaxSumOfSubarray {
    public static int sub_arrays(int[] arr){
        int total_subarray = 0;
        int[] sumArray = new int[arr.length * (arr.length + 1) / 2]; 
        // maximum possible subarrays = n*(n+1)/2

        int index = 0;
        for(int i=0 ; i<arr.length; i++){
            int start = i;
            for(int j=i ; j<arr.length; j++){
                int end = j; 
                int sum = 0;
                for(int k = start; k<=end ;  k++){
                    System.out.print(arr[k]+ " "); 
                    sum += arr[k];
                }  
                System.out.println(" sum = " + sum);
                sumArray[index++] = sum;   // store sum at next free index
                total_subarray++;
            } 
            System.out.println();
        }

        System.out.println("Total subarrays = " + total_subarray);
        for(int i=0; i<total_subarray; i++){
            System.out.println("Sum of " + (i+1) + "th subarray = " + sumArray[i]);
        }
        int max =  sumArray[0];
        for(int i=1; i<sumArray.length; i++){
          if(sumArray[i] > max){
             max = sumArray[i];
            }
        }
        System.out.println("Maximum sum of sub array = " + max);
        return total_subarray;
    }

    public static void main(String[] args){
        int[] arr = {2,4,6,8,10};
        sub_arrays(arr);
    }
}
