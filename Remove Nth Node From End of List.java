/*Given the head of a linked list, remove the nth node from the end of the list and return its head.

Example 1:
Input: head = [1,2,3,4,5], n = 2
Output: [1,2,3,5]

Example 2:
Input: head = [1], n = 1
Output: []

Example 3:
Input: head = [1,2], n = 1
Output: [1]

Constraints:
The number of nodes in the list is sz.
1 <= sz <= 30
0 <= Node.val <= 100
1 <= n <= sz
 

Follow up: Could you do this in one pass?*/


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
        int n;
    boolean reverse = false;
    public ListNode removeNthFromEnd(ListNode head, int n) {
    
        this.n = n;
        return removeFromEnd(head);
    }
    
    public ListNode removeFromEnd(ListNode head) {
        if (head == null) {
            reverse = true;
            return null;
        }
        
        ListNode temp = removeFromEnd(head.next);
        
        if (this.reverse)
            n--;
        
        if (n == 0) //found the node to be deleted
            return head.next;
        
        head.next = temp;
        
        return head;
    }
}
