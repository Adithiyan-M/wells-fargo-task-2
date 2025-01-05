

import javax.persistence.*;
import java.util.List;

@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long clientID;

    @ManyToOne
    @JoinColumn(name = "financialAdvisorID", nullable = false)
    private FinancialAdvisor financialAdvisor;

    @Column
    private String name;

    @Column
    private String contactInformation;

    @OneToMany(mappedBy = "client")
    private List<Portfolio> portfolios;

    public Client() {}

    public Client(FinancialAdvisor financialAdvisor, String name, String contactInformation) {
        this.financialAdvisor = financialAdvisor;
        this.name = name;
        this.contactInformation = contactInformation;
    }

    public Long getClientID() {
        return clientID;
    }

    public FinancialAdvisor getFinancialAdvisor() {
        return financialAdvisor;
    }

    public void setFinancialAdvisor(FinancialAdvisor financialAdvisor) {
        this.financialAdvisor = financialAdvisor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactInformation() {
        return contactInformation;
    }

    public void setContactInformation(String contactInformation) {
        this.contactInformation = contactInformation;
    }

    public List<Portfolio> getPortfolios() {
        return portfolios;
    }

    public void setPortfolios(List<Portfolio> portfolios) {
        this.portfolios = portfolios;
    }
}
