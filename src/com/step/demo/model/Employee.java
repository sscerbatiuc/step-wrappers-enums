package com.step.demo.model;

/**
 *
 * @author sscerbatiuc
 */
public class Employee {

    private String name;
    private String surname;
    private String idnp;
    // Care este tipul la gender? String? char? int? boolean?
    private char gender;

    public Employee(String name, String surname, String idnp, char gender) {
        this.name = name;
        this.surname = surname;
        this.idnp = idnp;
        this.gender = gender;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if(gender == 'M' || gender == 'F'){
            this.gender = gender;
        }
    }

}
