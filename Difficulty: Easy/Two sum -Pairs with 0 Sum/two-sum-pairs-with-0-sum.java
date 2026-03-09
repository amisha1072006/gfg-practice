// User function Template for Java

class Solution {
    public static ArrayList<ArrayList<Integer>> getPairs(int[] arr) {
        // code here
        Arrays.sort(arr);
        int n = arr.length;
        int i=0;
        int j=n-1;
        int sum=0;
       ArrayList<ArrayList<Integer>> list = new ArrayList<>();
       while(i<j){
          sum = arr[i]+arr[j];
          ArrayList<Integer> pair = new ArrayList<>();
          if(sum == 0){
              pair.add(arr[i]);
              pair.add(arr[j]);
              list.add(pair);

            while(i<j && arr[i]==arr[i+1]) i++;
            while(i<j && arr[j]==arr[j-1]) j--;
            i++;
            j--;
          }
          else if(sum<0){
              i++;
          }else{
              j--;
          }
         
       }
        return list;

    }
}
