class Solution {
    public ArrayList<ArrayList<Integer>> targetSumComb(int[] arr, int target) {
        // code here
                Arrays.sort(arr);
        int n = arr.length;
        ArrayList<Integer> candidates = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(arr[i]<=0) continue;
            if(i==0 || arr[i]!=arr[i-1]){
                candidates.add(arr[i]);
            }
        }
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        backtrack(candidates, 0, target, new ArrayList<>(), result);
        return result;
    }
    static void backtrack(ArrayList<Integer> candidates, int start, int target,ArrayList<Integer> paths, ArrayList<ArrayList<Integer>> result){
        // Base condition
        if(target==0){
            result.add(new ArrayList<>(paths));
            return;
        }
        
        for(int i=start;i<candidates.size();i++){
            // getting value at index i
            int value = candidates.get(i);
            // checking condition to check if value is greater then the target then that value will be excluded
            if(value>target){
                break;
            }
            // adding value to the paths List
            paths.add(value);
            // recurrsion backtrack call
            backtrack(candidates, i, target-value, paths, result);
            // Removing add last value - Backtrack step
            paths.remove(paths.size()-1);
        }

    }
}