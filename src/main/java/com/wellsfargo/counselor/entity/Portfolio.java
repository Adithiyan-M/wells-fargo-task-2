package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long portfolioId;

    @Column(nullable = false)
    @CreatedDate
    private String create_date;

    @Column(nullable = false)
    @UpdateTimestamp
    private String update_date;

    protected Portfolio() {
    }

    //created constructor for Portfolio
    public Portfolio(String create_date, String update_date) {
        this.create_date = create_date;
        this.update_date = update_date;
    }
    //create getter and setters for each field
    public long getId() {
        return portfolioId;
    }

    public String getCreate_date() {
        return create_date;
    }

    public void setCreate_date(String create_date) {
        this.create_date = create_date;
    }

    public String getUpdate_date() {
        return update_date;
    }
    public void setUpdate_date(String update_date) {
        this.update_date = update_date;
    }
}
