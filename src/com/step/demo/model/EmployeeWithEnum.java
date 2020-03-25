package com.step.demo.model;

import com.step.demo.enums.Gender;

/**
 *
 * @author sscerbatiuc
 */
public class EmployeeWithEnum {

    String name;
    String surname;
    String idnp;
    Gender gender;

    public EmployeeWithEnum(String name, String surname, String idnp, Gender gender) {
        this.name = name;
        this.surname = surname;
        this.idnp = idnp;
        this.gender = gender;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
    
    
}
