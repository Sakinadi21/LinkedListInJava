package Implementation; // Declare the package name

public class Implementation {

    // Definition of the Node class
    public static class Node {
        int data; // Value stored in the node
        Node next; // Reference to the next node

        // Constructor to initialize a node with data
        Node(int data) {
            this.data = data;
            this.next = null; // Initially, the next node is set to null
        }
    }

    // Definition of the LinkedList class
    public static class LinkedList {
        Node head = null; // Head of the linked list, initially null
        Node tail = null; // Tail of the linked list, initially null

        // Method to insert a new node at the end of the linked list
        void insertAtEnd(int val) {
            Node temp = new Node(val); // Create a new node with the given value
            if (head == null) { // If the list is empty
                head = temp; // Set both head and tail to the new node
                tail = temp;
            } else {
                tail.next = temp; // Connect the current tail to the new node
                tail = temp; // Update the tail to be the new node
            }
        }

        // Method to insert a new node at the head of the linked list
        void insertAtHead(int val) {
            Node temp = new Node(val); // Create a new node with the given value
            if (head == null) { // If the list is empty
                head = temp; // Set both head and tail to the new node
                tail = temp;
            } else {
                temp.next = head; // Point the new node's next to the current head
                head = temp; // Update the head to be the new node
            }
        }

        // Method to insert a new node at a specific index in the linked list
        void insertAt(int idx, int val) {
            if (idx == size()) { // If index is at the end of the list
                insertAtEnd(val); // Insert at the end
                return;
            } else if (idx == 0) { // If index is at the start of the list
                insertAtHead(val); // Insert at the head
                return;
            } else if (idx < 0 || idx > size()) { // If index is invalid
                System.out.println("wrong index");
                return;
            }

            Node t = new Node(val); // Create a new node with the given value
            Node temp = head; // Start from the head of the list
            for (int i = 1; i < idx; i++) { // Traverse to the node before the insertion point
                temp = temp.next;
            }
            t.next = temp.next; // Point the new node's next to the current node at idx
            temp.next = t; // Point the previous node's next to the new node
        }

        // Method to get the value of a node at a specific index
        int getAt(int idx) {
            if (idx < 0 || idx >= size()) { // If index is invalid
                System.out.println("wrong index");
                return -1;
            }
            Node temp = head; // Start from the head of the list
            for (int i = 0; i < idx; i++) { // Traverse to the node at the index
                temp = temp.next;
            }
            return temp.data; // Return the data of the node at idx
        }

        // Method to delete a node at a specific index
        void deleteAt(int idx) {
            if (idx < 0 || idx >= size()) { // If index is invalid
                System.out.println("wrong index");
                return;
            }
            if (idx == 0) { // If index is at the start of the list
                head = head.next; // Update the head to the next node
                if (head == null) { // If the list becomes empty
                    tail = null; // Update the tail to null
                }
                return;
            }
            Node temp = head; // Start from the head of the list
            for (int i = 1; i < idx; i++) { // Traverse to the node before the deletion point
                temp = temp.next;
            }
            temp.next = temp.next.next; // Point the previous node's next to the node after idx
            if (temp.next == null) { // If the deleted node was the tail
                tail = temp; // Update the tail
            }
        }

        // Method to display the elements of the linked list
        void display() {
            Node temp = head; // Start from the head of the list
            while (temp != null) { // Traverse until the end of the list
                System.out.print(temp.data + " "); // Print the data of the current node
                temp = temp.next; // Move to the next node
            }
            System.out.println(); // Print a new line after displaying all elements
        }

        // Method to get the size of the linked list
        int size() {
            int size = 0;
            Node temp = head; // Start from the head of the list
            while (temp != null) { // Traverse until the end of the list
                size++; // Increment the size counter
                temp = temp.next; // Move to the next node
            }
            return size; // Return the size of the list
        }

        // Main method to test the linked list implementation
        public static void main(String[] args) {
            LinkedList ll = new LinkedList(); // Create a new linked list

            ll.insertAtEnd(4); // Insert 4 at the end of the list: 4
            ll.display(); // Display the list: 4

            ll.insertAtEnd(5); // Insert 5 at the end of the list: 4 5
            ll.display(); // Display the list: 4 5

            ll.insertAtEnd(12); // Insert 12 at the end of the list: 4 5 12
            ll.display(); // Display the list: 4 5 12

            ll.insertAtHead(13); // Insert 13 at the head of the list: 13 4 5 12
            ll.display(); // Display the list: 13 4 5 12

            ll.insertAt(3, 10); // Insert 10 at index 3: 13 4 5 10 12
            ll.display(); // Display the list: 13 4 5 10 12

            System.out.println(ll.tail.data); // Display the data of the tail: 12

            System.out.println(ll.getAt(3)); // Get the value at index 3: 10

            ll.deleteAt(4); // Delete the node at index 4: 13 4 5 10
            ll.display(); // Display the list: 13 4 5 10
        }
    }
}
