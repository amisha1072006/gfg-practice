class Solution {
    int maxLength(int arr[]) {
        // code here
        int sum = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        int res = 0 ;
        int i = 0;
        int n = arr.length;
        map.put(0,-1);
        while(i<n){
            sum+=arr[i];
            if(sum==0){
                res = Math.max(res,i+1);
            }
            else if(map.containsKey(sum)){
                int j = map.get(sum);
                res = Math.max(res,i-j);
            }
            else map.put(sum,i);
            i++;
        }
        return res;
    }
}