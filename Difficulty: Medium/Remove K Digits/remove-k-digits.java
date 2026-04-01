class Solution {
    public String removeKdig(String s, int k) {
        // code here
                Stack<Character> st = new Stack<>();

        for (char ch : s.toCharArray()) {
            while (!st.isEmpty() && k > 0 && st.peek() > ch) {
                st.pop();
                k--;
            }
            st.push(ch);
        }

        // remove remaining k digits from end
        while (k > 0 && !st.isEmpty()) {
            st.pop();
            k--;
        }

        // build result
        StringBuilder res = new StringBuilder();
        while (!st.isEmpty()) {
            res.append(st.pop());
        }
        res.reverse();

        // remove leading zeros
        int i = 0;
        while (i < res.length() && res.charAt(i) == '0') {
            i++;
        }

        String ans = res.substring(i);
        return ans.isEmpty() ? "0" : ans;
    }
}