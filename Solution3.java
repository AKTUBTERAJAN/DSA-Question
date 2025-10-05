public class Solution3 {
    public static void main(String args[]){
        int arr[]={1, 2, 6, 10, 18, 54};
        int n=arr.length;
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                for(int k=j+1;j<n;j++){
                    if(arr[j]*arr[j]==arr[i]*arr[k]){
                        System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
                    }
                    
                }
            }
        }
    }
}
