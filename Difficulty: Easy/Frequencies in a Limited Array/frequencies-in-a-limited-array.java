class Solution {
    public List<Integer> frequencyCount(int[] arr) {
        // code here
        int n = arr.length;
        int[] freq = new int[n];
        for(int i = 0;i<n;i++){
            int currentNum = arr[i];
            if(currentNum >=1 && currentNum <= n){
                freq[currentNum-1]++;
            }
        }
        List<Integer> result =new ArrayList<>();
        for(int f : freq){
            result.add(f);
           }
           return result;
        }
     }
