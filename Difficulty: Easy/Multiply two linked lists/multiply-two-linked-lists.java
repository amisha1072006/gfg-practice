/*Node is defined as
class Node
{
    int data;
    Node next;
    Node(int data) {
        this.data=data;
        this.next = null;
    }
}*/

class Solution {
    public long multiplyTwoLists(Node first, Node second) {
        // Code here
        long MOD = 1000000007;
        String s1 = "",s2 = "";
        
        while(first != null || second != null) {
            if(first != null) {
                s1 += first.data;
                first = first.next;
            }
            
            if(second != null) {
                s2 += second.data;
                second = second.next;
            }
        }
        
        long num1 = Integer.parseInt(s1);
        long num2 = Integer.parseInt(s2);
        
        return (num1*num2) % MOD;

    }
}