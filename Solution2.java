// Print  the index of largest number int the array

public class Solution2 {
    public static int index1(int arr[]){
        int largest=Integer.MIN_VALUE;
        int index=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                index =i;
            }
        }
        return index;
    }
    public static void main(String args[]){
        int arr[]={4,5,3,2,-1,6,};
        System.out.println(index1(arr));
    }
}
