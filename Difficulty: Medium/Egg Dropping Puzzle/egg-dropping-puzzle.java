class Solution {

    // Function to find minimum number of attempts needed in
    // order to find the critical floor.
    static int eggDrop(int n, int k) {
        // code here
         if(n == 1)return k;
        int oper = 0;
        while(k > 1 && n > 2)
        {
            k /= 2;
            n--;
            oper++;
        }
        int l = 0, r = k, extra = k;
        while(l <= r)
        {
            int mid = (l+r)/2;
            if((mid*(mid+1))/2 >= k)
            {
                extra = mid;
                r = mid-1;
            }
            else l = mid+1;
        }
        return oper+extra;
    }
}