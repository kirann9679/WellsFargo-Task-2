package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Security {
    @Id
    @GeneratedValue()
    private long securityId;
    @ManyToOne
    private ClientPortfolio clientPortfolio;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private String purchasePrice;

    @Column(nullable = false)
    private String purchaseDate;

    @Column(nullable = false)
    private String quantity;

    protected Security() {

    }

    public Security(ClientPortfolio clientPortfolio,String name, String category, String purchasePrice, String purchaseDate, String quantity) {
        this.clientPortfolio=clientPortfolio;
        this.name = name;
        this.category = category;
        this.purchasePrice = purchasePrice;
        this.purchaseDate = purchaseDate;
        this.quantity = quantity;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setClientPortfolioPortfolio(ClientPortfolio clientPortfolio) {
        this.clientPortfolio = clientPortfolio;
    }


    public void setCategory(String category) {
        this.category = category;
    }

    public void setPurchasePrice(String purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public void setPurchaseDate(String purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public long getSecurityId() {
        return securityId;
    }
    public ClientPortfolio  getClientPortfolio() {
        return clientPortfolio;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public String getPurchasePrice() {
        return purchasePrice;
    }

    public String getPurchaseDate() {
        return purchaseDate;
    }

    public String getQuantity() {
        return quantity;
    }
}
