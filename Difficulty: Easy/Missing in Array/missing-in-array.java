import java.util.*;
class Solution {
   public static int missingNum(int arr[]) {
        // code here
        int n = arr.length+1;
        long total = (long) n*(n+1)/2;
        long expect =0;
        for(int i=0;i<arr.length;i++){
            expect +=arr[i];
        }
        long value = total - expect;
        return (int) value;
        }
        public static void main(String[] args){
            Solution sn = new Solution();
            int[] arr = {1,2,3,5};
            int v1 = sn.missingNum(arr);
            System.out.println(v1);
        }
    }
