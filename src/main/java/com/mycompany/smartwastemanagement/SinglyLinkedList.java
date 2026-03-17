/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.smartwastemanagement;

// Author: Abdullah Albadry
public class SinglyLinkedList {
    private Node head; 
    private int size;

    public SinglyLinkedList() {
        this.head = null;
        this.size = 0;
    }

    
    public void addBin(WasteBin bin) {
        Node newNode = new Node(bin);
// This method has a Time Complexity of O(n) because it traverses 
// the entire list to add a node to the end.
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
    
    
    public int getSize() { return size; }
    
    
    public boolean updateBinFill(String id, double newLevel) {
        Node current = head;
        while (current != null) {
            if (current.getData().getBinID().equals(id)) {
                current.getData().setCurrentLoad(newLevel);
                return true; 
            }
            current = current.getNext();
        }
        return false; // Not found
    }

  
    public boolean removeBin(String id) {
        if (head == null) return false;
// Search and Delete is O(n) as it performs a linear search for the ID.
               if (head.getData().getBinID().equals(id)) {
            head = head.getNext();
            size--;
            return true;
        }

        Node current = head;
        while (current.getNext() != null) {
            if (current.getNext().getData().getBinID().equals(id)) {
                
                current.setNext(current.getNext().getNext());
                size--;
                return true;
            }
            current = current.getNext();
        }
        return false;
    }
    
    public String getAllBinsAsString() {
    StringBuilder sb = new StringBuilder();
    Node current = head;
    while (current != null) {
        sb.append("ID: ").append(current.getData().getBinID())
          .append(" | Location: ").append(current.getData().getLocation())
          .append("\n");
        current = current.getNext();
    }
    return sb.toString();
}
}
