package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class ClientPortfolio {
    @Id
    @GeneratedValue
    private long clientPortfolioId;
    @Column(nullable = false)
    private String creationDate;
    protected ClientPortfolio() {
    }

    public ClientPortfolio(String creationDate) {
        this.creationDate = creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public long getClientPortfolioId() {
        return clientPortfolioId;
    }

    public String getCreationDate() {
        return creationDate;
    }
}
