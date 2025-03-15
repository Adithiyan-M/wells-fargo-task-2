package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import java.time.LocalDate;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue()
    private long portfolioId;  //No Setter, only a Getter

    @Column(nullable = false)
    private Long clientId;

    @Column(nullable = false)
    private LocalDate creationDate;

//*************
//CONSTRUCTORS
//*************

    protected Portfolio() {

    }

    public Portfolio(Long clientId){
        this.clientId = clientId;
    }

//*************
//Getters
//*************

    public Long getClientId() {
        return clientId;
    }

    public long getPortfolioId() {
        return portfolioId;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

//*************
//Setters
//*************

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

}
