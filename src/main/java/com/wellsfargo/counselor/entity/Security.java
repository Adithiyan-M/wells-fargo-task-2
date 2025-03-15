package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import java.time.LocalDate;

@Entity
public class Security {


    @Id
    @GeneratedValue()
    private long securityId;  //No Setter, only a Getter
    @Column(nullable = false)
    private String securityName;
    @Column(nullable = false)
    private String securityCategory;
    @Column(nullable = false)
    private String purchasePrice;
    @Column(nullable = false)
    private int quantity;
    @Column(nullable = false)
    private LocalDate purchaseDate;
    @Column(nullable = false)
    private long portfolioId;


//*************
//CONSTRUCTORS
//*************

    protected void Security(){

    }

    public void Security(String securityName, String securityCategory, String purchasePrice, int quantity, LocalDate purchaseDate, Long portfolioId){
        this.securityName = securityName;
        this.securityCategory = securityCategory;
        this.purchasePrice = purchasePrice;
        this.quantity = quantity;
        this.purchaseDate = purchaseDate;
        this.portfolioId = portfolioId;
    }

//*************
//Getters
//*************

    public long getSecurityId() {
        return securityId;
    }

    public String getSecurityName() {
        return securityName;
    }

    public String getSecurityCategory() {
        return securityCategory;
    }

    public String getPurchasePrice() {
        return purchasePrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public LocalDate getPurchaseDate() {
        return purchaseDate;
    }


    public long getPortfolioId() {
        return portfolioId;
    }


//*************
//Setters
//*************

    public void setSecurityName(String securityName) {
        this.securityName = securityName;
    }

    public void setSecurityCategory(String securityCategory) {
        this.securityCategory = securityCategory;
    }

    public void setPurchasePrice(String purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPurchaseDate(LocalDate purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public void setPortfolioId(long portfolioId) {
        this.portfolioId = portfolioId;
    }

}
