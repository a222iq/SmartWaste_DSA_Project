/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.smartwastemanagement;
// Author: Abdullah Albadry
public class GeneralWasteBin extends WasteBin {
    private boolean hasCompactor;

    public GeneralWasteBin(String binID, String location, double capacity, boolean hasCompactor) {
        super(binID, location, capacity);
        this.hasCompactor = hasCompactor;
    }

    @Override
    public String getBinType() {
        return hasCompactor ? "General Waste (Compactor Active)" : "General Waste";
    }
}
