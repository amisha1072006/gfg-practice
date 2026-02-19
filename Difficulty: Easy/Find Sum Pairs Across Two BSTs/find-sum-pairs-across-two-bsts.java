/*
class Node {
    int data;
    Node left, right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    public static int countPairs(Node root1, Node root2, int x) {
        // code here
         Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        createSet(root1, set1);
        createSet(root2, set2);
        
        int counter = 0;
        for(int val : set1) {
            if (set2.contains(x-val)) counter++;
        }
        return counter;
        
    }
    static void createSet(Node root, Set<Integer> set) {
        if (root == null)  return;
        createSet(root.left, set);
        set.add(root.data);
        createSet(root.right, set);
    
    }
}