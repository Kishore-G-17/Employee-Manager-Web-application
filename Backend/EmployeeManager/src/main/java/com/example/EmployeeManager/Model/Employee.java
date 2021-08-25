package com.example.EmployeeManager.Model;

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
    private Long Id;
    private String name;
    private String email;
    private String jobTitle;
    private String imageUrl;
    private String phone;
    @Column(nullable = false, updatable = false)
    private String employeeCode;

    public Employee() {
    }

    public Employee(Long Id, String name, String email, String jobTitle, String imageUrl, String phone,
            String employeeCode) {
        this.Id = Id;
        this.name = name;
        this.email = email;
        this.jobTitle = jobTitle;
        this.imageUrl = imageUrl;
        this.phone = phone;
        this.employeeCode = employeeCode;
    }

    public Employee(String name, String email, String jobTitle, String imageUrl, String phone, String employeeCode) {
        this.name = name;
        this.email = email;
        this.jobTitle = jobTitle;
        this.imageUrl = imageUrl;
        this.phone = phone;
        this.employeeCode = employeeCode;
    }

    /**
     * @return Long return the Id
     */
    public Long getId() {
        return Id;
    }

    /**
     * @param Id the Id to set
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return String return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return String return the jobTitle
     */
    public String getJobTitle() {
        return jobTitle;
    }

    /**
     * @param jobTitle the jobTitle to set
     */
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    /**
     * @return String return the imageUrl
     */
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * @param imageUrl the imageUrl to set
     */
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    /**
     * @return String return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return String return the employeeCode
     */
    public String getEmployeeCode() {
        return employeeCode;
    }

    /**
     * @param employeeCode the employeeCode to set
     */
    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    @Override
    public String toString() {
        return ("Employee{" + "id = " + this.Id + "\n" + "name = " + this.name + "\n" + "email = " + this.email + "\n"
                + "jobTitle = " + this.jobTitle + "\n" + "phone = " + this.phone + "\n" + "imageUrl = " + this.imageUrl
                + "\n" + "employeeCode = " + this.employeeCode + "\n" + "}");
    }

}