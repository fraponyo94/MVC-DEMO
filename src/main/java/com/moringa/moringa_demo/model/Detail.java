package com.moringa.moringa_demo.model;

public class Detail {

    private String firstName;
    private String lastName;

    public Detail() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName =lastName;
    }

    @Override
    public String toString() {
        return "Detail{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
