package org.example;

//Inheritance
public class IndividualCustomer extends Customer {
    private String firstName;
    private String lastName;

    //Getter - Setter
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
