package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class ClientPortfolio {
    @Id
    @GeneratedValue
    private long clientPortfolioId;
    @ManyToOne
    private Client client;

    @Column(nullable = false)
    private String creationDate;
    protected ClientPortfolio() {
    }

    public ClientPortfolio(Client client,String creationDate) {
        this.client=client;
        this.creationDate = creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }
    public void setClient(Client client) {
        this.client = client;
    }


    public long getClientPortfolioId() {
        return clientPortfolioId;
    }
    public Client getCLient() {
        return client;
    }

    public String getCreationDate() {
        return creationDate;
    }
}
