package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;
 
@Entity
public class Portfolio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long portfolioId;

    @ManyToOne
    @JoinColumn(name = "client_id", nullable = false)
    private Client client;

    @Column(nullable = false)
    private String time;

    protected Portfolio() {
    }

    public Portfolio(Client client, String time) {
        this.client = client;
        this.time = time;
    }

    public Long getPortfolioId() {
        return this.portfolioId;
    }

    public Client getClient() {
        return this.client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getTime() {
        return this.time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
