package entities;
import javax.persistence.*; 
import java.util.List; 
@Entity 
public class FinancialAdvisor
 { 
    @Id
     @GeneratedValue(strategy = GenerationType.AUTO) 
     private Long id;
      @Column 
      private String name; 
      @Column 
      private String contactInformation; 
      @OneToMany(mappedBy = "financialAdvisor") 
      private List<Client> clients; 
      public FinancialAdvisor() {} 
      public FinancialAdvisor(String name, String contactInformation) 
      { 
        this.name = name; 
        this.contactInformation = contactInformation;
     }
      public Long getId() 
     { 
        return id; 
    } public String getName() 
    { 
        return name; 
    } 
    public void setName(String name)
     { 
        this.name = name;
     } public String getContactInformation() {
         return contactInformation; 
        }
         public void setContactInformation(String contactInformation) 
         {
             this.contactInformation = contactInformation; 
            } 
            public List<Client> getClients() { 
                return clients; 
            }
             public void setClients(List<Client> clients) {
                 this.clients = clients;
                 }}