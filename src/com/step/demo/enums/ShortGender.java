/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.step.demo.enums;

/**
 *
 * @author sscerbatiuc
 */
public enum ShortGender {

    MALE("M"),
    FEMALE("F");
    private String value;

    ShortGender(String value) {
        this.value = value;
    }

    public static ShortGender valueOfIgnoreCase(String value){
        for(ShortGender gender: values()){
            if(gender.value.equalsIgnoreCase(value)){
                return gender;
            }
        }
        throw new IllegalArgumentException("Expected M/F. Got " + value);
    }

}
