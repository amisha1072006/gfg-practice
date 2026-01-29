class Solution {
    public ArrayList<ArrayList<Integer>> fourSum(int[] arr, int target) {
        // code here
                if (arr == null || arr.length < 4) {
            final ArrayList<ArrayList<Integer>> res1;
            res1 = new ArrayList<>();
            return res1;
        }
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();

        for (int i = 0; i < arr.length - 3; i++) {
            if(i > 0 && arr[i] == arr[i-1]) {
                continue;
            }
            for (int j = i + 1; j < arr.length - 2; j++) {
                if(j > i + 1 && arr[j] == arr[j-1]) {
                    continue;
                }
                int k = j + 1, l = arr.length - 1;
                while (k < l) {
                    long sum = arr[i] + arr[j] + arr[k] + arr[l];
                    if(sum == target){
                        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr[i], arr[j], arr[k], arr[l]));
                        if(!set.contains(list)) {
                            res.add(list);
                            set.add(list);
                        }
                        while (k < l && arr[l] == arr[l - 1]) l--;
                        while (k < l && arr[k] == arr[k + 1]) k++;
                        l--;
                        k++;
                    } else if (sum > target){
                        l--;
                    } else {
                        k++;
                    }
                }
            }
        }
        return res;

    }
}