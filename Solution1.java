        // Maximum in array which is at-least twice of other elements
        // Last Updated : 03 Mar, 2023
        // Given an array of integers of length n. Our task is to return the index of the max element if the it is at least twice as much as every other number in the array. If the max element does not satisfy the condition return -1.

        // Examples: 

        // Input : arr = {3, 6, 1, 0}
        // Output : 6
        // Here, 6 is the largest integer, and for 
        

        // Input :   arr = {1, 2, 3, 4}
        // Output : 4
        // 4 isn't at least as big as twice the value
 public class Solution1 {
    public static int  max(int arr[]) {
        int largest=Integer.MIN_VALUE;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
                
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int arr[]={3,6,1,0};
        System.out.println(max(arr));
        
    }
            
 }
