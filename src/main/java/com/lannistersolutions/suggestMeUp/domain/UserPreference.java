package com.lannistersolutions.suggestMeUp.domain;

public class UserPreference {
    private String productType; // e.g., "phone", "laptop"
    private double budget; // User's budget
    private String primaryUse; // e.g., "gaming", "work", "general"
    private boolean preferEMI; // true for EMI, false for ready cash

    // Constructor
    public UserPreference(String productType, double budget, String primaryUse, boolean preferEMI) {
        this.productType = productType;
        this.budget = budget;
        this.primaryUse = primaryUse;
        this.preferEMI = preferEMI;
    }

    // Getters and Setters
    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public String getPrimaryUse() {
        return primaryUse;
    }

    public void setPrimaryUse(String primaryUse) {
        this.primaryUse = primaryUse;
    }

    public boolean isPreferEMI() {
        return preferEMI;
    }

    public void setPreferEMI(boolean preferEMI) {
        this.preferEMI = preferEMI;
    }

    // Optional: toString method for easier debugging and logging
    @Override
    public String toString() {
        return "UserPreference{" +
                "productType='" + productType + '\'' +
                ", budget=" + budget +
                ", primaryUse='" + primaryUse + '\'' +
                ", preferEMI=" + preferEMI +
                '}';
    }
}
