package com.company;

public class Subject1 {
    private int idSubject;
    private String nameSubject;
    private float gpa;


    public Subject1(int idSubject, String nameSubject, float gpa) {
        this.idSubject = idSubject;
        this.nameSubject = nameSubject;
        this.gpa = gpa;
    }

    public int getIdSubject() {
        return idSubject;
    }

    public void setIdSubject(int idSubject) {
        this.idSubject = idSubject;
    }

    public String getNameSubject() {
        return nameSubject;
    }

    public void setNameSubject(String nameSubject) {
        this.nameSubject = nameSubject;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }
}
