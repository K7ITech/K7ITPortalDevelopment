package com.k7it.sms.Entity;

import javax.persistence.*;

@Entity
@Table(name ="Student")
public class Student {

    
    @Column(name = "student_id", length = 45)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int studentid;

    @Column(name = "student_name", length = 255)
    private String studentname;

    @Column(name ="email",length=255)
    private String email;
    @Column(name = "password",length =255)
    private String password;

    public Student() {
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

    public Student(int studentid, String studentname, String email, String password) {
        this.studentid = studentid;
        this.studentname = studentname;
        this.email = email;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentid=" + studentid +
                ", studentname='" + studentname + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

