package com.company;

class Student {

    private int ID;
    private String firstName;
    private String address;
    private String day;
    private String gender;
    private String listSubject;
    private int idSubject;
    private String nameSubject;
    private float gpa;


    public Student(int ID, String firstName, String address, String day, String gender, String listSubject, int idSubject, String nameSubject, float gpa) {
        super();
        this.ID = ID;
        this.firstName = firstName;
        this.address = address;
        this.day = day;
        this.gender = gender;
        this.listSubject = listSubject;
        this.idSubject = idSubject;
        this.nameSubject = nameSubject;
        this.gpa = gpa;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getListSubject() {
        return listSubject;
    }

    public void setListSubject(String listSubject) {
        this.listSubject = listSubject;
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

    @Override
    public String toString() {
        return "Student{" +
                "ID=" + ID +
                ", firstName='" + firstName + '\'' +
                ", address='" + address + '\'' +
                ", day='" + day + '\'' +
                ", gender='" + gender + '\'' +
                ", listSubject='" + listSubject + '\'' +
                ", idSubject=" + idSubject +
                ", nameSubject='" + nameSubject + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}