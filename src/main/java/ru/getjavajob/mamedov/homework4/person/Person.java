package ru.getjavajob.mamedov.homework4.person;

import java.util.Date;

/**
 * Created by Ganzhenko on 23.09.2016.
 */
public class Person {
    private int perosnId;
    private String personPhone;
    private String personName, personFamily, personFatherName;
    private Date birthdate;

    @Override
    public String toString() {
        return "Person{" +
                "perosnId=" + perosnId +
                ", personPhone='" + personPhone + '\'' +
                ", personName='" + personName + '\'' +
                ", personFamily='" + personFamily + '\'' +
                ", personFatherName='" + personFatherName + '\'' +
                ", birthdate=" + birthdate +
                '}';
    }

    public int getPerosnId() {
        return perosnId;
    }

    public void setPerosnId(int perosnId) {
        this.perosnId = perosnId;
    }

    public String getPersonPhone() {
        return personPhone;
    }

    public void setPersonPhone(String personPhone) {
        this.personPhone = personPhone;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getPersonFamily() {
        return personFamily;
    }

    public void setPersonFamily(String personFamily) {
        this.personFamily = personFamily;
    }

    public String getPersonFatherName() {
        return personFatherName;
    }

    public void setPersonFatherName(String personFatherName) {
        this.personFatherName = personFatherName;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }
}
