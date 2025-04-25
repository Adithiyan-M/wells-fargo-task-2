package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class FinancialAdvisor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "advisor", cascade = CascadeType.ALL)
    private List<Client> clients = new ArrayList<>();  // Initialize the list

    // Default constructor
    public FinancialAdvisor() {}

    // Constructor with name
    public FinancialAdvisor(String name) {
        this.name = name;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }

    // Method to add a client with null check for clients list
    public void addClient(Client client) {
        if (client != null) {
            clients.add(client);
            client.setAdvisor(this);
        }
    }

    // Method to remove a client
    public void removeClient(Client client) {
        if (client != null && clients != null) {
            clients.remove(client);
            client.setAdvisor(null);
        }
    }
}