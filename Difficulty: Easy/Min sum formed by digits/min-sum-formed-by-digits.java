// User function Template for Java

class Solution {

    public static long minSum(int arr[], int n) {
        // Your code goes here
         long num1 = 0;
        long num2 = 0;
        Arrays.sort(arr);
        for(int i = 0 ; i<n; i++){
            if(i%2==0){
                num1 = num1*10+arr[i];
            }else{
                 num2 = num2*10+arr[i];
            }
        }
        return num1+num2;

    }
}