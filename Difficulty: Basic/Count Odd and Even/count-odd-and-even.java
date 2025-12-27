class Solution {
    public int[] countOddEven(int[] arr) {
        // Code here
        int n = arr.length;
      int countodd = 0,counteven=0;
        for(int i=0;i<n;i++){
            if(arr[i]%2 !=0){
            countodd++;
                 }
            else{
              counteven++;
            }
        }
        return new int[] {countodd,counteven};
    }
}