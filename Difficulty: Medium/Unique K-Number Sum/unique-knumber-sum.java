class Solution {
    public ArrayList<ArrayList<Integer>> combinationSum(int n, int k) {
        // code here
                ArrayList<ArrayList<Integer>>ans=new ArrayList<>();
        ArrayList<Integer>l=new ArrayList<>();
        int arr[]=new int[9];
        for(int i=1;i<=9;i++) arr[i-1]=i;  //creating an array of elements 1-9
        helper(arr,0,n,k,ans,l);
        return ans;
    }
    public void helper(int arr[],int i,int n,int k,ArrayList<ArrayList<Integer>>ans,ArrayList<Integer>l){
        if(n==0 && l.size()==k){   // if sum of list==n and size of list ==k
            if(!ans.contains(l))
            ans.add(new ArrayList<>(l));    //if not dound in ans list,add it to ans list
        }
        if(i>=9) return;
        if(arr[i]<=n && l.size()<k){   //if ele<=target and size is less than k
            l.add(arr[i]);                    //add it to list
            helper(arr,i+1,n-arr[i],k,ans,l);         //explore 
            l.remove(l.size()-1);          //backtrack
        }
        helper(arr,i+1,n,k,ans,l);     //explore other elements

    }
}