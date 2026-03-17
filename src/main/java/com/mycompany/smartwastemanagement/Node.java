/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.smartwastemanagement;



public class Node {
    private WasteBin data; // The Bin object
    private Node next;     // Link to the next node

    public Node(WasteBin data) {
        this.data = data;
        this.next = null;
    }

    // Getters and Setters (Required for the List to work)
    public WasteBin getData() { return data; }
    public Node getNext() { return next; }
    public void setNext(Node next) { this.next = next; }
}
