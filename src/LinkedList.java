/**
 * LinkedList class represents a singly linked list.
 * It supports basic operations like adding and removing elements from the head, 
 * removing nodes by value, and adding nodes after a specific node.
 */
class LinkedList {

    /**
     * Node class represents an individual node in the linked list.
     * Each node contains data and a reference to the next node.
     */
    static class Node {
        int data; // Data stored in the node
        Node next; // Reference to the next node in the list

        // Constructor to initialize a node with data
        public Node(int data) {
            this.data = data;
            this.next = null; // The next node is initially set to null
        }
    }

    private Node head; // The head of the linked list, initially set to null

    /**
     * Adds a new node with the given value at the head of the linked list.
     *
     * @param n the value to be added at the head
     */
    public void addHead(int n) {
        Node newNode = new Node(n); // Create a new node with the given value
        Node temp;

        // If the list is empty, the new node becomes the head
        if (head == null) {
            head = newNode;
            head.next = null; // The next of head is null, as it's the only node
        } else {
            // If the list is not empty, update the head to be the new node
            temp = head; // Store the current head node
            head = newNode; // The new node becomes the head
            head.next = temp; // The new head's next points to the previous head
        }
    }

    /**
     * Prints all the elements in the linked list.
     */
    public void print() {
        // If the list is empty, print a message
        if (head == null) {
            System.out.println("The linked list is empty");
            return;
        }

        // Traverse the list and print the data of each node
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " "); // Print node data
            current = current.next; // Move to the next node
        }
        System.out.println(); // Print a newline at the end
    }

    /**
     * Removes the node at the head of the linked list.
     * If the list is empty, prints an appropriate message.
     */
    public void removeHead() {
        // If the list is empty, print a message
        if (head == null) {
            System.out.println("The linked list is empty");
            return;
        }

        // Otherwise, remove the head node by updating the head to the next node
        Node temp = head;
        head = head.next;
        temp.next = null; // Disconnect the removed node from the list
    }

    /**
     * Removes the first node with the specified value from the linked list.
     * If the node with the value is not found, prints an appropriate message.
     *
     * @param n the value to be removed
     */
    public void removeNode(int n) {
        // If the list is empty, print a message
        if (head == null) {
            System.out.println("The linked list is empty");
            return;
        }

        Node current = head;

        // Traverse the list to find the node to remove
        while (current.next != null && current.next.data != n) {
            current = current.next; // Move to the next node
        }

        // If the node with the value is found, remove it
        if (current.next == null) {
            System.out.println("Value not found"); // Node with value not found
        } else {
            current.next = current.next.next; // Bypass the node to remove it
        }
    }

    /**
     * Adds a new node with the given data after the node with the specified value.
     * If the node with the value is not found, prints an appropriate message.
     *
     * @param n the value after which the new node is added
     * @param data the value of the new node to be added
     */
    public void addAfter(int n, int data) {
        // If the list is empty, print a message
        if (head == null) {
            System.out.println("The linked list is empty");
            return;
        }

        Node newNode = new Node(data); // Create a new node with the given data
        Node current = head;

        // Traverse the list to find the node with value n
        while (current != null && current.data != n) {
            current = current.next;
        }

        // If the node with value n is not found, print a message
        if (current == null) {
            System.out.println("Value not found");
        } else {
            // Insert the new node after the node with value n
            newNode.next = current.next; // The new node's next points to the current node's next
            current.next = newNode; // The current node's next is updated to the new node
        }
    }
}
