class Solution {
    public ArrayList<Integer> findDuplicates(int[] arr) {
     ArrayList<Integer> list=new ArrayList<>();
       HashSet<Integer> duplicate = new HashSet<>();
       
       for(int a : arr)
       {
           if(!duplicate.add(a))
           {
               list.add(a);
           }
       }
       return list;
       
}
}