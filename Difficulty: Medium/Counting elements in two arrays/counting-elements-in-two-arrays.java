class Solution {
    public static ArrayList<Integer> countLessEq(int a[], int b[]) {
        // code here
        int count=0;
        ArrayList<Integer> al=new ArrayList<>(a.length);
        int l=0;
        int r=b.length;
        Arrays.sort(b);
        for(int i=0;i<a.length;i++){
            l=0;
            r=b.length;
            while(l<r){
                int mid=(l+r)/2;
                if(b[mid]<=a[i]){
                    l=mid+1;
                }
                else
                    r=mid;
                
            }
            al.add(l);
        }
        return al;

    }
}