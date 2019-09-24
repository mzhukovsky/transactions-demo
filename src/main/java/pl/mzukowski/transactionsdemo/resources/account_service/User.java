package pl.mzukowski.transactionsdemo.resources.account_service;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    private String login;
    private String password;

    @OneToOne
    private Employee employee; // User powinien trzymać referencję do employee bo nie może bez niego istnieć.

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
