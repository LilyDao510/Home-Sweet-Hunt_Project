package org.anitab.model;

public class Apartment {
    private String streetAddress;
    private int bedrooms;
    private float bathrooms;
    private int price;

    public Apartment(String streetAddress, int bedrooms, float bathrooms, int price) {
        this.streetAddress = streetAddress;
        this.bedrooms = bedrooms;
        this.bathrooms = bathrooms;
        this.price = price;
    }

        public String getStreetAddress() {
            return streetAddress;
        }

        public int getBedrooms() {
            return bedrooms;
        }

        public float getBathrooms() {
            return bathrooms;
        }

        public int getPrice() {
            return price;
        }



    @Override
    public String toString() {
        return "Apartment: " + streetAddress + ", "
                + bedrooms + " bed / " + bathrooms + " bath, $" + price;
    }
}
