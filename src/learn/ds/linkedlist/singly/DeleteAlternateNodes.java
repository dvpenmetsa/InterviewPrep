package learn.ds.linkedlist.singly;

import learn.ds.nodes.ListNode;
import learn.util.LinkedList;
import learn.util.RandLinkedListGenetator;

/**
 * @author Varma Penmetsa
 *
 * Given a Singly Linked List, starting from the second node delete all alternate nodes of it.
 * For example, if the given linked list is 1->2->3->4->5 then your function should convert it to 1->3->5,
 * and if the given linked list is 1->2->3->4 then convert it to 1->3.
 *
 * https://www.geeksforgeeks.org/delete-alternate-nodes-of-a-linked-list/
 *
 */

public class DeleteAlternateNodes {

    /*
     * Iterative Solution
     * Time Complexity : O(n)
     * Space Complexity : O(1)
     */
    public static void delAltNodes(ListNode head){
        if (head==null || head.next==null) return ;
        ListNode curr = head;
        while(curr!=null && curr.next!=null){
               curr.next = curr.next.next;
               curr=curr.next;
        }
    }

    /*
     * Recursive Solution
     * Time Complexity : O(n)
     * Space Complexity : O(1)
     */
    public static void delAltNodes2(ListNode head){
        if (head==null || head.next==null) return ;
        head.next = head.next.next;
        delAltNodes(head.next);
    }

    public static void main(String args[]){
        LinkedList ll  = new RandLinkedListGenetator().create(3);
        ll.display();
        delAltNodes2(ll.head);
        ll.display();
    }

}
