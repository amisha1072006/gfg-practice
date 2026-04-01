// User function Template for Java

class Solution {
    public int rowWithMax1s(int arr[][]) {
        // code here
                // code here
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            int count = 0;
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j] == 1){
                    count++;
                }
            }
            list.add(count);
        }
        
        int max = 0;
        int index = -1;
        for(int i=0;i<list.size();i++){
            if(list.get(i) > max){
                max = list.get(i);
                index = i;
            }
        }
        return index;

    }
}