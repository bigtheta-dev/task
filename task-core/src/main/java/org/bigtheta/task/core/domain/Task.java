package org.bigtheta.task.core.domain;

import javax.persistence.*;

@Entity
@Table(name = "TASKS")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "VALUES")
    private String value;

    @Column(name = "GROUPS")
    private String group;

    @Column(name = "STATUS")
    private Status status;

    public Task() {
    }

    public Task(String value, String group) {
        this.id = id;
        this.value = value;
        this.group = group;
        this.status = Status.active;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getValue() {
        return this.value;
    }

    public String getGroup() {
        return this.group;
    }
}
