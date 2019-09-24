package pl.mzukowski.transactionsdemo.resources.project_service;

import pl.mzukowski.transactionsdemo.resources.project_register.Project;

import javax.persistence.*;

import java.time.LocalDate;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
public class Execution {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    private String task;
    private LocalDate localDate;
    private Boolean perform;

    @ManyToOne
    @JoinColumn(name = "project_id")
    private Project project;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public Boolean getPerform() {
        return perform;
    }

    public void setPerform(Boolean perform) {
        this.perform = perform;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }
}
