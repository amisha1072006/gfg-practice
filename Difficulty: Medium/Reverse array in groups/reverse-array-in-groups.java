class Solution {
    public void reverseInGroups(int[] arr, int k) {
        // code here
                for(int i=0;i<arr.length;i+=k)
        {
            int st=i;
            int end=Math.min(arr.length-1,i+k-1);
            while(st<=end){
                int temp=arr[st];
                arr[st]=arr[end];
                arr[end]=temp;
                st++;
                end--;
            }
            
        }

    }
}