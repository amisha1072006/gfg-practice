class Solution {
    public int minStep(int n) {
        // code here
                return n>1?(n%3==0?1+minStep(n/3):1+minStep(n-1)):0;

    }
}
