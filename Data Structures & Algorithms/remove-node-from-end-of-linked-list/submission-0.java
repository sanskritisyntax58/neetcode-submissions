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
    public ListNode removeNthFromEnd(ListNode head, int n) {
    ListNode curr=head;
    int l=0;
    while(curr!=null){
        l++;
        curr=curr.next;
    }
    curr=head;
    int count=0;
    int nd=l-n;
    if(nd==0)return curr.next;
    while(curr!=null){
    count++;
    if(count==nd){
      curr.next=curr.next.next;
      break;}
    curr=curr.next;
    }
    return head;
    }
}
