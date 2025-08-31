class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        int n = arr.length;
        Arrays.sort(arr);
        int duplicate = -1;
        int missing = -1;
        for(int i = 1;i<n;i++){
            if(arr[i] == arr[i-1]){
                duplicate = arr[i];
                break;
            }
        }
        int expected =1;
        for(int i = 0;i<n;i++){
            if(arr[i] == expected){
                expected++;
            } else if(arr[i] > expected){
                missing = expected;
            }
        }
        if(missing == -1){
            missing = arr.length;
        }
        list.add(duplicate);
        list.add(missing);
        return list;
    }
}
