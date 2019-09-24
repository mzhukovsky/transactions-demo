package pl.mzukowski.transactionsdemo.resources.account_service;

import pl.mzukowski.transactionsdemo.resources.project_register.Project;

import javax.persistence.*;

import java.util.List;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;
    private Double salary;

    @ManyToMany(mappedBy = "managers")
    private List<Project> orderies;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public List<Project> getOrderies() {
        return orderies;
    }

    public void setOrderies(List<Project> orderies) {
        this.orderies = orderies;
    }
}
