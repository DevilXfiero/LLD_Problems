public abstract class Account {
    private Long id;
    private String password;
    private AccountStatus status;
    private Person person;

    public boolean resetPassword(String password) {
        this.password = password;
        System.out.println("Password has been successfully updated");
        return true;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Account(Long id, String password, AccountStatus status, Person person) {
        this.id = id;
        this.password = password;
        this.status = status;
        this.person = person;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public AccountStatus getStatus() {
        return status;
    }

    public void setStatus(AccountStatus status) {
        this.status = status;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
