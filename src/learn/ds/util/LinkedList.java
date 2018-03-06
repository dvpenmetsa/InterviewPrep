package learn.ds.util;

/**
 * @author Varma Penmetsa
 */

import learn.ds.nodes.SListNode;

public class LinkedList {

    public SListNode head;

    public LinkedList() {

    }

    public LinkedList(SListNode head) {
        this.head = head;
    }

    /* Push adds node on front of the list*/
    public void push(int data) {
        SListNode new_node = new SListNode(data);
        new_node.next = head;
        head = new_node;

    }

    /* Pop removes first element in the linked list*/
    public void pop() {
        if (head == null) {
            System.out.println("\nNo Elements to pop ");
            return;
        }
        head = head.next;
    }

    /* Print elements of a linked list*/
    public void display() {
        SListNode node = head;
        while (node != null) {
            System.out.print(node.data + " --> ");
            node = node.next;
        }
        System.out.println("null");
    }

    public void display2(SListNode head) {
        SListNode node = head;
        while (node != null) {
            System.out.print(node.data + " --> ");
            node = node.next;
        }
        System.out.println("null");
    }

    /* Add after last node */
    public void append(int new_data) {

        if (head == null) {
            head = new SListNode(new_data);
            return;
        }
        SListNode new_node = new SListNode(new_data);
        SListNode node = head;
        while (node.next != null) {
            node = node.next;
        }
        node.next = new_node;
    }

    /*Length of a linked list*/
    public int length() {
        SListNode node = head;
        int i = 0;
        while (node != null) {
            i++;
            node = node.next;
        }
        return i;
    }

    /* Insert after a given node */
    public void insertAfter(SListNode prev, int new_data) {

        SListNode new_node = new SListNode(new_data);
        SListNode temp;

        if (null == prev) {
            System.out.println("Given node cant't be null");
            return;
        }
        new_node.next = prev.next;
        prev.next = new_node;
    }


    /*Search an element in linked list iterative solution*/
    public int search(int data) {
        SListNode temp = head;

        while (temp != null && temp.data != data) {
            temp = temp.next;
        }

        if (temp == null) {
            return -1;
        }
        return 1;

    }

    /*Search an element in linked list recursive solution*/
    public boolean searchRecursive(SListNode head, int data) {
        if (head == null) {
            return false;
        }
        if (head.data == data) {
            return true;
        }
        return searchRecursive(head.next, data);
    }

    /* Write a function to get Nth node in a Linked List */
    public SListNode getNode(int position) {
        SListNode node = head;
        int i = 0;
        while (node != null && i < position) {
            i++;
            node = node.next;
        }
        return node;
    }

    public static void main(String args[]) {
        LinkedList ll = new LinkedList(new SListNode(10));
        SListNode a = new SListNode(20);
        SListNode b = new SListNode(30);
        SListNode c = new SListNode(40);
        SListNode d = new SListNode(50);
        SListNode e = new SListNode(60);
        SListNode f = new SListNode(70);

        ll.head.next = a;
        ll.head.next.next = b;
        ll.head.next.next.next = c;
        ll.head.next.next.next.next = d;
        ll.head.next.next.next.next.next = e;
        ll.head.next.next.next.next.next.next = f;
        ll.append(10);
        ll.append(10);
        ll.append(10);
        ll.push(5);
        ll.push(1);
        ll.pop();
        ll.pop();
        ll.insertAfter(a, 25);

        ll.display();
        System.out.println("Length of linked list: " + ll.length());
        System.out.println(ll.searchRecursive(ll.head, 10));
        System.out.println(ll.getNode(9));
        ll.display();
    }

}