package com.k7it.sms.DTO;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class StudentDTO {


    private int studentid;
    private String studentname;
    private String email;
    private String password;

    public StudentDTO(int studentid, String studentname, String email, String password) {
        this.studentid = studentid;
        this.studentname = studentname;
        this.email = email;
        this.password = password;
    }

    public int getStudentid() {
        return studentid;
    }

    public void setStudentid(int studentid) {
        this.studentid = studentid;
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String  toString() {
        return "StudentDTO{" +
                "studentid=" + studentid +
                ", studentname='" + studentname + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
