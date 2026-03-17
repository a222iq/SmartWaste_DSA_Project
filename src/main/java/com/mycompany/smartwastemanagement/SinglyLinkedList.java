/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.smartwastemanagement;



public class SinglyLinkedList {
    private Node head; // The start of the list
    private int size;

    public SinglyLinkedList() {
        this.head = null;
        this.size = 0;
    }

    // ADD (Create): Adds a bin to the end of the list
    public void addBin(WasteBin bin) {
        Node newNode = new Node(bin);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
        size++;
    }
    
    // Getter for size
    public int getSize() { return size; }
}