class Solution {
    // Function to remove duplicates from the given array.
    ArrayList<Integer> removeDuplicates(int[] arr) {
        // code here
        int n = arr.length;
        ArrayList<Integer> ans = new ArrayList<>();
        if(n==0) return ans;
        ans.add(arr[0]);
        for(int i =1;i<n;i++){
            if(arr[i] != arr[i-1]){
                ans.add(arr[i]);
            }
        }
        return ans;
    }
}

