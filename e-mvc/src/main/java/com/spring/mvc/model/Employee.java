package com.spring.mvc.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Employee {

    private long id;
    private String name;
    private String contactNumber;
    private String workingArea;

    public Employee() {
        super();
    }

    public Employee(final long id, final String name, final String contactNumber, final String workingArea) {
        this.id = id;
        this.name = name;
        this.contactNumber = contactNumber;
        this.workingArea = workingArea;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getWorkingArea() {
        return workingArea;
    }

    public void setWorkingArea(String workingArea) {
        this.workingArea = workingArea;
    }
}
