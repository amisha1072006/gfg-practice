class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
                ArrayList<Integer> lead = new ArrayList<>();
        int max = arr[arr.length-1];
        lead.add(max);
        for(int i=arr.length-2; i>=0; i--){
            if(arr[i]>=max){
                lead.add(arr[i]);
                max = arr[i];
            }
        }
        Collections.reverse(lead);
        return lead;
    
    }
}
