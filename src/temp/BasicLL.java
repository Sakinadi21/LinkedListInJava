package temp;

public class BasicLL {

    // Method to display the elements of the linked list
    public static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println(); // Print a new line after displaying all elements
    }

    // Method to calculate the length of the linked list
    public static int length(Node head) {
        int count = 0; // Initialize a counter to keep track of the number of nodes

        // Traverse through the linked list and count nodes
        while (head != null) {
            count++;
            head = head.next;
        }
        return count; // Return the total number of nodes in the linked list
    }

    // Definition of the Node class
    public static class Node {
        int data; // value
        Node next; // address of the next node

        // Constructor to initialize a node with data
        Node(int data) {
            this.data = data;
            this.next = null; // initially, the next node is set to null
        }
    }

    // Main method to test the linked list operations
    public static void main(String[] args) {
        // Creating nodes with data values
        Node a = new Node(5);
        Node b = new Node(3);
        Node c = new Node(9);
        Node d = new Node(8);
        Node e = new Node(16);

        // Linking the nodes to form a linked list: 5 -> 3 -> 9 -> 8 -> 16
        a.next = b; // a -> b (5 -> 3)
        b.next = c; // a -> b -> c (5 -> 3 -> 9)
        c.next = d; // a -> b -> c -> d (5 -> 3 -> 9 -> 8)
        d.next = e; // a -> b -> c -> d -> e (5 -> 3 -> 9 -> 8 -> 16)

        // Display the linked list
        System.out.print("Linked List elements: ");
        display(a);

        // Calculate and print the length of the linked list
        int len = length(a);
        System.out.println("Length of the linked list: " + len);
    }
}
