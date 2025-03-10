# Singly Linked List in Java

A simple **singly linked list** implementation in Java, supporting basic operations like adding, removing, and printing elements.

## Features
✔ Add a node at the head  
✔ Remove the head node  
✔ Delete a node by value  
✔ Insert a node after a specific value  
✔ Print the list  

## Usage
```java
LinkedList list = new LinkedList();
list.addHead(10);  // Add 10 to the head
list.addHead(20);  // Add 20 to the head
list.print();      // Output: 20 10

list.removeHead(); // Remove head (20)
list.addAfter(10, 30); // Insert 30 after 10
list.print();      // Output: 10 30
