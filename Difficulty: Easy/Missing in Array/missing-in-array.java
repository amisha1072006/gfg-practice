import java.util.Scanner;
class Solution {
    int missingNum(int arr[]) {
        // code here
        long n= arr.length+1;
        long total = (n*(n+1))/2;
        long expect = 0;
        for(int i=0;i<arr.length;i++){
            expect +=arr[i];
        }
        long value = total-expect;
        return (int) value;
    }
    public static void main(String[] args){
        Solution sn = new Solution();
        int[] arr = {8,2,4,5,3,7,1};
        int v1 = sn.missingNum(arr);
        System.out.println(v1);
    }
}