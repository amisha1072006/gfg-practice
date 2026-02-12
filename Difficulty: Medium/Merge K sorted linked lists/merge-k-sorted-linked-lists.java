/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    Node mergeKLists(Node[] arr) {
        // code here
                if (arr == null || arr.length == 0) {
            return null;
        }
        
        // Step 1: Min Heap banao
        // Sabse chhota element hamesha top pe rahega
        PriorityQueue<Node> minHeap = new PriorityQueue<>(
            (a, b) -> a.data - b.data
        );
        
        // Step 2: Har list ka first node heap mein dalo
        for (Node node : arr) {
            if (node != null) {
                minHeap.offer(node);
            }
        }
        
        // Step 3: Dummy node banao result list ke liye
        Node dummy = new Node(0);
        Node tail = dummy;
        
        // Step 4: Jab tak heap khali nahi hota
        while (!minHeap.isEmpty()) {
            // Sabse chhota element nikalo
            Node smallest = minHeap.poll();
            
            // Result list mein add karo
            tail.next = smallest;
            tail = tail.next;
            
            // Agar us list mein aur nodes hain, heap mein dalo
            if (smallest.next != null) {
                minHeap.offer(smallest.next);
            }
        }
        
        return dummy.next;

    }
}