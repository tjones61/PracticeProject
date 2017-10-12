/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practiceproject;

/**
 *
 * @author tjones61
 */
public class Customer {

    private int custID;
    private String firstName;
    private String lastName;
    private String phoneNum;
    private String address;

    public Customer(int custID, String firstName, String lastName, String phoneNum, String address) {
        this.setCustID(custID);
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setPhoneNum(phoneNum);
        this.setAddress(address);
    }

    public final int getCustID() {
        return custID;
    }

    public final void setCustID(int custID) {
        if (custID < 0) {
            throw new IllegalArgumentException("This is not a valid customer ID");
        }
        this.custID = custID;
    }

    public final String getFirstName() {
        return firstName;
    }

    public final void setFirstName(String firstName) {
        if (firstName.length() < 2 || firstName.length() > 15) {
            throw new IllegalArgumentException("This is not a valid first name");
        }
        this.firstName = firstName;
    }

    public final String getLastName() {
        return lastName;
    }

    public final void setLastName(String lastName) {
        if (lastName.length() < 2 || firstName.length() > 15) {
            throw new IllegalArgumentException("This is not a valid last name");
        }
        this.lastName = lastName;
    }

    public final String getPhoneNum() {
        return phoneNum;
    }

    public final void setPhoneNum(String phoneNum) {
        if (phoneNum.length() < 10 || firstName.length() > 10) {
            throw new IllegalArgumentException("This is not a valid phone number");
        }
        this.phoneNum = phoneNum;
    }

    public final String getAddress() {
        return address;
    }

    public final void setAddress(String address) {
        if (address.length() == 0) {
            throw new IllegalArgumentException("This is not a valid address");
        }
        this.address = address;
    }

}
