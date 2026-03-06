class Solution {
    static List<Integer> firstNegInt(int arr[], int k) {
        // write code here
          int n = arr.length;
        int i=0;int j=0;
        Deque<Integer> d = new ArrayDeque<>();
        List<Integer> res = new ArrayList<>();
        
        while(j<n){
            if(arr[j]<0) d.addLast(arr[j]);
            if(j-i+1 == k){
                
                if(d.size()>0) res.add(d.getFirst());
                else res.add(0);
                if(arr[i]<0) d.removeFirst();
                i++;
            }
            j++;
        }
        return res;
    }
}