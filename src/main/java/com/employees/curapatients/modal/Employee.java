package com.employees.curapatients.modal;

import jakarta.persistence.*;


@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    @Column(name = "employee_id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "supervisors")
    private String superVisors;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String passWord;



    public Employee() {

    }

    public Employee(String name, String phoneNumber, String superVisors, String username, String passWord) {
        super();
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.superVisors = superVisors;
        this.username = username;
        this.passWord = passWord;
    }

    // Standard getters and setters omitted for brevity
    public String getName() {
        return name;
    }

    public Long getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getSuperVisors() {
        return superVisors;
    }

    public void setSuperVisors(String superVisors) {
        this.superVisors = superVisors;
    }

    public String getUserName() {
        return username;
    }

    public void setUserName(String username) {
        this.username = username;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public Employee orElseThrow(Object object) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'orElseThrow'");
    }
}
