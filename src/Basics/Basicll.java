package Basics;

public class Basicll {

    public static class Node {
        int data; // value
        Node next; // address of the next node

        // Constructor to initialize a node with data
        Node(int data) {
            this.data = data;
            this.next = null; // initially, the next node is set to null
        }
    }

    public static void main(String[] args) {
        // Creating nodes with data values
        Node a = new Node(5);
        Node b = new Node(3);
        Node c = new Node(9);
        Node d = new Node(8);
        Node e = new Node(16);

        // Linking the nodes to form a linked list: 5 -> 3 -> 9 -> 8 -> 16
        a.next = b;//5->3
        b.next = c;//5->3->9
        c.next = d;//5->3->9->8
        d.next = e;//5->3->9->8->16

        System.out.println(a); //Basicll$Node@6acbcfc0
        System.out.println(a.data); //5
        System.out.println(a.next); //Basicll$Node@5f184fc6

        System.out.println(b); //Basicll$Node@5f184fc6
        System.out.println("---------------");


        System.out.println(a); //Basicll$Node@6acbcfc0
        System.out.println(a.next); //5
        System.out.println(a.next.data); //3
        System.out.println(a.next.next.data); //9
        System.out.println(a.next.next.next.data);//8



        // Printing the data values of the linked list nodes
        Node current = a; // Start with the head node 'a'
        while (current != null) {
            System.out.print(current.data + " "); // Print the current node's data
            current = current.next; // Move to the next node
        }
    }
}
