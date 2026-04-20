class Solution {
    public ArrayList<Integer> leafNodes(int[] preorder) {
        // code here
                ArrayList<Integer> result = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        int n = preorder.length;

        if (n == 0) return result;

        for (int i = 0, j = 1; j < n; i++, j++) {
            boolean found = false;

            if (preorder[i] > preorder[j]) {
                stack.push(preorder[i]);
            } else {
                while (!stack.isEmpty()) {
                    if (preorder[j] > stack.peek()) {
                        stack.pop();
                        found = true;
                    } else {
                        break;
                    }
                }
                
                if (found) {
                    result.add(preorder[i]);
                }
            }
        }
                       result.add(preorder[n - 1]);
        return result;

    }
}