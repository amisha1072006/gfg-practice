class Solution {
    public ArrayList<Integer> findDuplicates(int[] arr) {
        //BRUTE FORCE APPROACH
        
     ArrayList<Integer> list=new ArrayList<>();
     int n = arr.length;
  //for(int i =0;i<n;i++){
    //       for(int j = i+1;j<n;j++){
    //           if(arr[i] == arr[j] && !list.contains(arr[i])){
    //               list.add(arr[i]);
    //           }
    //       }
    //   }
    // Collections.sort(list);
    //   return list;
    
    //OPTMIZED APPROACH
    int[] freq = new int[n+1];
    for(int i =0;i<n;i++)
{
    freq[arr[i]]++;
}
for(int i=1;i<=n;i++){
    if(freq[i] >1){
        list.add(i);
        
    }
    }
    // if(list.isEmpty()){
    //     list.add(-1);
    //     }
      return list;
}
}
