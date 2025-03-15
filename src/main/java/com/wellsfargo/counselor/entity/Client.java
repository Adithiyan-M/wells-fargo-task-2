package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Client {

        @Id
        @GeneratedValue()
        private long clientId;  //No Setter, only a Getter

        @Column(nullable = false)
        private String firstName;

        @Column(nullable = false)
        private String lastName;

        @Column(nullable = false)
        private String address;

        @Column(nullable = false)
        private String phone;

        @Column(nullable = false)
        private String email;

        @Column(nullable = false)
            private Long advisorId;


//*************
//CONSTRUCTORS
//*************

    protected Client() {

    }

    public Client(String firstName, String lastName, String address, String phone, String email, Long advisorId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.advisorId = advisorId;
    }

//*************
//Getters
//*************

    public long getClientId() {
        return clientId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public Long getAdvisorId() {
        return advisorId;
    }


//*************
//Setters
//*************


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAdvisorId(Long advisorId) {
        this.advisorId = advisorId;
    }

}

