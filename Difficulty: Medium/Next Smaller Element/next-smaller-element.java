class Solution {
    static ArrayList<Integer> nextSmallerEle(int[] arr) {
        // code here
               ArrayList<Integer>list=new ArrayList<>();
       
       for(int i=0;i<arr.length;i++){
           boolean f=false;
           for(int j=i+1;j<arr.length;j++){
               if(arr[j]<arr[i])
               {
                   list.add(arr[j]);
                   f=true;
                   break;
               }
           }
           if(!f){
               list.add(-1);
           }
       }
       return list;
        

    }
}