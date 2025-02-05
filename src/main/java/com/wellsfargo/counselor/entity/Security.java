package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDate;
import com.wellsfargo.counselor.enums.SecurityType;

@Entity
public class Security {
    
    protected Security() {

    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long security_id;

    @Column(nullable = false)
    private Long portfolio_id;

    @Column(nullable = false)
    private String security_name;

    @Column(nullable = false)
    private SecurityType category;

    @Column(nullable = false)
    private LocalDate purchased_date;

    @Column(nullable = false)
    private Double purchase_price;

    @Column(nullable = false)
    private Float quantity;

    public Long getSecurity_id() {
        return security_id;
    }

    public void setSecurity_id(Long security_id) {
        this.security_id = security_id;
    }

    public Long getPortfolio_id() {
        return portfolio_id;
    }

    public void setPortfolio_id(Long portfolio_id) {
        this.portfolio_id = portfolio_id;
    }

    public String getSecurity_name() {
        return security_name;
    }

    public void setSecurity_name(String security_name) {
        this.security_name = security_name;
    }

    public SecurityType getCategory() {
        return category;
    }

    public void setCategory(SecurityType category) {
        this.category = category;
    }

    public LocalDate getPurchased_date() {
        return purchased_date;
    }

    public void setPurchased_date(LocalDate purchased_date) {
        this.purchased_date = purchased_date;
    }

    public Double getPurchase_price() {
        return purchase_price;
    }

    public void setPurchase_price(Double purchase_price) {
        this.purchase_price = purchase_price;
    }

    public Float getQuantity() {
        return quantity;
    }
    
}
