// Last updated: 7/9/2026, 9:16:46 AM
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

public class Solution {
    public boolean hasCycle(ListNode head) {
        HashMap<ListNode, Integer> visited = new HashMap<>();
        
        ListNode current = head;
        while (current != null) {
            if (visited.containsKey(current)) {
                return true; 
            }
            visited.put(current, current.val);
            current = current.next;
        }
        
        return false;
    }
}
