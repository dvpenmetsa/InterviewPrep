package learn.ds.linkedlist.singly;
/*
 *@author Varma Penmetsa
 *Function that moves last element to front in a given Singly Linked List.
 *For example, if the given Linked List is 1->2->3->4->5, then the function should change the list to 5->1->2->3->4
 */

import learn.ds.nodes.ListNode;
import learn.util.LinkedList;
import learn.util.RandLinkedListGenetator;

public class LastToFirst {

    /*
     * Create a circular linked list by connecting last to head and break loop by setting prev = null
     */
    public static void moveToFront(LinkedList ll){
        ListNode head = ll.head;
        if(head==null ){
            return;
        }
        ListNode prev = null;
        ListNode curr = head;
        while(curr.next!=null){
            prev = curr;
            curr=curr.next;
        }
        curr.next = head;
        ll.head = curr;
        prev.next = null;
    }

    public static void main(String args[]) {
        LinkedList ll = new RandLinkedListGenetator().create(7);
        ll.display();
        moveToFront(ll);
        ll.display();
    }
}
