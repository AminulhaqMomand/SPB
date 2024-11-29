package com.halalpza.spb.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
@Entity
public class Customer {


        @Id
        @GeneratedValue
        private Long CustomerID;
        private String FirstName;

        public Long getCustomerID() {
            return CustomerID;
        }

        public String getFirstName() {
            return FirstName;
        }

        public String getLastName() {
            return LastName;
        }

        public void setCustomerID(Long customerID) {
            CustomerID = customerID;
        }

        public void setFirstName(String firstName) {
            FirstName = firstName;
        }

        public void setLastName(String lastName) {
            LastName = lastName;
        }

        public void setPhoneNumber(String phoneNumber) {
            PhoneNumber = phoneNumber;
        }

        public void setEmail(String email) {
            Email = email;
        }

        public void setAddress(String address) {
            Address = address;
        }

        public String getPhoneNumber() {
            return PhoneNumber;
        }

        public String getEmail() {
            return Email;
        }

        public String getAddress() {
            return Address;
        }

        private String LastName;
        private String PhoneNumber;
        private String  Email;
        private String Address;
}
