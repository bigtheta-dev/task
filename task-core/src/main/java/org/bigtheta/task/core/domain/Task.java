package org.bigtheta.task.core.domain;

import static org.bigtheta.task.core.domain.Status.active;

public class Task {

    private Integer id;
    private String value;
    private String group;
    private Status status;

    public Task() {
    }

    public Task(Integer id, String value, String group) {
        this.id = id;
        this.value = value;
        this.group = group;
        this.status = active;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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
