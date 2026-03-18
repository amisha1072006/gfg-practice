class Solution {
    public ArrayList<ArrayList<Integer>> uniqueCombinations(int[] arr, int target) {
        // code here
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>>result=new ArrayList<>();
        findCombination(0,arr,target,new ArrayList<>(),result);
        return result;
    }
    static void findCombination(int ind,int arr[],int target,ArrayList<Integer>ds,ArrayList<ArrayList<Integer>>result){
        if(target==0){
            result.add(new ArrayList<>(ds));
            return;
        }
        for(int i=ind;i<arr.length;i++){
            if(i!=ind && arr[i]==arr[i-1]){
                continue;
            }
            if(arr[i]>target){
                break;
            }
            else{
                ds.add(arr[i]);
                findCombination(i+1,arr,target-arr[i],ds,result);
                ds.remove(ds.size()-1);
            }
        }
    }
}