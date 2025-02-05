package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Client {
    
    protected Client() {

    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long client_id;

    @Column(nullable = false)
    private Long advisor_id;

    @Column(nullable = false)
    private String client_name;

    public Long getClient_id() {
        return client_id;
    }

    public void setClient_id(Long client_id) {
        this.client_id = client_id;
    }

    public Long getAdvisor_id() {
        return advisor_id;
    }

    public void setAdvisor_id(Long advisor_id) {
        this.advisor_id = advisor_id;
    }

    public String getClient_name() {
        return client_name;
    }

    public void setClient_name(String client_name) {
        this.client_name = client_name;
    }
    
}
