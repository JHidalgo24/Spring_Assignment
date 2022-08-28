package edu.wctc.Models;

public class Sale {
    private String fullName;
    private String country;
    private double total;
    private double tax;

    private double shipping;

    public Sale(String fullName, String country, double total, double tax) {
        this.fullName = fullName;
        this.country = country;
        this.total = total;
        this.tax = tax;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }


    public double getShipping() {
        return shipping;
    }

    public void setShipping(double shipping) {
        this.shipping = shipping;
    }
}
