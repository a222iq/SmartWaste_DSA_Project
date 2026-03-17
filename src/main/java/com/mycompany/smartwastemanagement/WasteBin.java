/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.smartwastemanagement;
public abstract class WasteBin {
    // Protected so subclasses can access them directly
    protected String binID;
    protected String location;
    protected double capacity;
    protected double currentLoad;

    // Constructor to initialize the object data 
    public WasteBin(String binID, String location, double capacity) {
        this.binID = binID;
        this.location = location;
        this.capacity = capacity;
        this.currentLoad = 0.0;
    }

    // Abstract method: All subclasses MUST implement their own version (Polymorphism) 
    public abstract String getBinType();

    // Getters
    public String getBinID() { return binID; }
    public String getLocation() { return location; }
    public double getFillLevel() { return currentLoad; }
    
    // Setters
    public void setCurrentLoad(double currentLoad) { this.currentLoad = currentLoad; }
}