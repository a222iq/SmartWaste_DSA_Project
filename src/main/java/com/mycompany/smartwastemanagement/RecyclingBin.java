/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.smartwastemanagement;

public class RecyclingBin extends WasteBin {
    private String materialType; // Specific to recycling (e.g., "Plastic")

    public RecyclingBin(String binID, String location, double capacity, String materialType) {
        super(binID, location, capacity); // Calls the WasteBin constructor
        this.materialType = materialType;
    }

    @Override
    public String getBinType() {
        return "Recycling (" + materialType + ")";
    }
}