class Solution {
    public void reverseArray(int arr[]) {
        // code here
        int n = arr.length;
        int nums = 0;
        int marks[] = new int[n];
        for(int i=n-1;i>=0;i--){
            marks[nums] = arr[i];
        //System.out.println(marks[nums]);
        nums++;
        }
        for(int i = 0;i<n;i++){
            arr[i]=marks[i];
        }
        
    }
}