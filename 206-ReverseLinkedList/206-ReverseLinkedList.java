// Last updated: 7/9/2026, 9:16:27 AM
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
    ListNode h1=head;
    ListNode h2=null;
    while(h1!=null){
        ListNode temp= h1.next;
        h1.next=h2;
        h2=h1;
        h1=temp;

    }   
    return h2;
    }
}