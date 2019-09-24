package pl.mzukowski.transactionsdemo.resources.project_register;

import pl.mzukowski.transactionsdemo.resources.account_service.Employee;
import pl.mzukowski.transactionsdemo.resources.project_service.Execution;

import javax.persistence.*;

import java.util.List;

import static javax.persistence.GenerationType.*;

@Entity
public class Project {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    private String description;
    private Boolean active;

    @ManyToMany
    @JoinTable(
            name = "pracownicy_w_projektach",
            joinColumns = {@JoinColumn(name="projekt_id")},
            inverseJoinColumns = {@JoinColumn(name="pracownik_id")}
    )
    private List<Employee> managers;

    @OneToMany(mappedBy = "project")
    private List<Execution> executions;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public List<Employee> getManagers() {
        return managers;
    }

    public void setManagers(List<Employee> managers) {
        this.managers = managers;
    }

    public List<Execution> getExecutions() {
        return executions;
    }

    public void setExecutions(List<Execution> executions) {
        this.executions = executions;
    }
}
