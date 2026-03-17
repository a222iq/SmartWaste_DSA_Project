/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.smartwastemanagement;

// Author: Abdullah Albadry

public class Node {
    private WasteBin data; 
    private Node next;     

    public Node(WasteBin data) {
        this.data = data;
        this.next = null;
    }

    
    public WasteBin getData() { return data; }
    public Node getNext() { return next; }
    public void setNext(Node next) { this.next = next; }
}
