package com.application.propertyapplication;

public class Property {

    private String name;
    private String address;
    private int carParks;
    private int bedrooms;
    private int bathrooms;
    private String image;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCarParks() {
        return carParks;
    }

    public void setCarParks(int carParks) {
        this.carParks = carParks;
    }

    public int getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(int bedrooms) {
        this.bedrooms = bedrooms;
    }

    public int getBathrooms() {
        return bathrooms;
    }

    public void setBathrooms(int bathrooms) {
        this.bathrooms = bathrooms;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getPropertyDetails() {
        return "Car Parks: " + carParks + "\t\t\t\t\t\tBedrooms: " + bedrooms + "\t\t\t\t\t\tBathrooms: " + bathrooms;
    }

}