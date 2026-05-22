package accounts;

public class Account {
   private Integer id;
   private String name;
   private String document;
   private String email;
   private String password;

    public Account(String name, String document, String email, String password) {
        this.name = name;
        this.document = document;
        this.email = email;
        this.password = password;
                
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDocument() {
        return document;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    void printAccountInfo() {
        System.out.println("Name → " + name);
        System.out.println("Document → " + document);
        System.out.println("Email → " + email);        

    }
    
}
