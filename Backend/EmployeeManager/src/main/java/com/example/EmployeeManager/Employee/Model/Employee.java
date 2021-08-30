package com.example.EmployeeManager.Employee.Model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

@Entity
@Table(name = "employee")
@EnableAutoConfiguration
public class Employee implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String name;
    private String email;
    private String jobtitle;
    private String imageurl;
    private String phone;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getJobtitle() {
        return this.jobtitle;
    }

    public void setJobtitle(String jobtitle) {
        this.jobtitle = jobtitle;
    }

    public String getImageurl() {
        return this.imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Employee() {
    }

    public Employee(Long id, String name, String email, String jobtitle, String imageurl, String phone) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.jobtitle = jobtitle;
        this.imageurl = imageurl;
        this.phone = phone;
    }

    public Employee(String name, String email, String jobtitle, String imageurl, String phone) {
        this.name = name;
        this.email = email;
        this.jobtitle = jobtitle;
        this.imageurl = imageurl;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return ("Employee{" + "id = " + this.id + "\n" + "name = " + this.name + "\n" + "email = " + this.email + "\n"
                + "jobTitle = " + this.jobtitle + "\n" + "phone = " + this.phone + "\n" + "imageUrl = " + this.imageurl
                + "}");
    }

}