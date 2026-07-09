/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
    HashMap <Node,Node> hie= new HashMap<>();
    Node curr=head;
    if(head==null){
        return null;
    } 
    while(curr!=null){
        Node copy=new Node(curr.val);
        hie.put(curr,copy);
        copy=null;
        curr=curr.next;
    }
    curr=head;
    while(curr!=null){
    Node copy=hie.get(curr);
    copy.next=hie.get(curr.next);
    copy.random=hie.get(curr.random);
    curr=curr.next;
    }
    return hie.get(head);
    }
}
