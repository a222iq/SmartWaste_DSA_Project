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
    
    // SEARCH & UPDATE: Find a bin by ID and change its fill level
    public boolean updateBinFill(String id, double newLevel) {
        Node current = head;
        while (current != null) {
            if (current.getData().getBinID().equals(id)) {
                current.getData().setCurrentLoad(newLevel);
                return true; // Found and updated
            }
            current = current.getNext();
        }
        return false; // Not found
    }

    // DELETE: Remove a bin from the list by ID
    public boolean removeBin(String id) {
        if (head == null) return false;

        // Special case: If the bin to delete is the first one (head)
        if (head.getData().getBinID().equals(id)) {
            head = head.getNext();
            size--;
            return true;
        }

        Node current = head;
        while (current.getNext() != null) {
            if (current.getNext().getData().getBinID().equals(id)) {
                // Link the current node to the one AFTER the next node
                current.setNext(current.getNext().getNext());
                size--;
                return true;
            }
            current = current.getNext();
        }
        return false;
    }
}
