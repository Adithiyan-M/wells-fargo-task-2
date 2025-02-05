package com.wellsfargo.counselor.entity;

import java.time.LocalDate;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import com.wellsfargo.counselor.enums.PortfolioType;


@Entity
public class Portfolio {
    
    protected Portfolio() {

    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long portfolio_id;

    @Column(nullable = false)
    private Long client_id;

    @Column(nullable = false)
    private LocalDate creation_date;

    @Column(nullable = false)
    private String portfolio_name;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private PortfolioType portfolio_type;

    @Column(nullable = false)
    private Double portfolio_value;

    public Long getPortfolio_id() {
        return portfolio_id;
    }

    public void setPortfolio_id(Long portfolio_id) {
        this.portfolio_id = portfolio_id;
    }

    public Long getClient_id() {
        return client_id;
    }

    public void setClient_id(Long client_id) {
        this.client_id = client_id;
    }

    public LocalDate getCreation_date() {
        return creation_date;
    }

    public void setCreation_date(LocalDate creation_date) {
        this.creation_date = creation_date;
    }

    public String getPortfolio_name() {
        return portfolio_name;
    }

    public void setPortfolio_name(String portfolio_name) {
        this.portfolio_name = portfolio_name;
    }

    public PortfolioType getPortfolio_type() {
        return portfolio_type;
    }

    public void setPortfolio_type(PortfolioType portfolio_type) {
        this.portfolio_type = portfolio_type;
    }

    public Double getPortfolio_value() {
        return portfolio_value;
    }

    public void setPortfolio_value(Double portfolio_value) {
        this.portfolio_value = portfolio_value;
    }

}
